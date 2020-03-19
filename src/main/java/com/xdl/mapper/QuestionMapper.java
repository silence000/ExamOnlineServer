package com.xdl.mapper;

import com.xdl.bean.Question;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface QuestionMapper {
    @Insert("INSERT INTO question (desccription, question_type_id, points, group_id, is_visible, create_time, last_modify, answer, difficulty, analysis, reference, examing_point, keyword) VALUES (#{desccription},#{question_type_id},#{points},1,1,SYSDATE(),SYSDATE(),#{answer},#{difficulty},#{analysis},#{reference},#{examing_point},#{keyword});")
    @Options(useGeneratedKeys = true, keyColumn = "id", keyProperty = "id")
    public int insertQuestion(Question question);

    @Insert("INSERT INTO question_2_point (question_id, point_id) VALUES (#{question_id},#{point_id})")
    public int insertQuestion_2_point(@Param("question_id") Integer question_id,
                                      @Param("point_id") Integer point_id);

    @Insert("INSERT INTO question_2_option (question_id, Option_name, Option_content) VALUES (#{question_id},#{Option_name},#{Option_content})")
    public int insertQuestion_2_option(@Param("question_id") Integer question_id,
                                       @Param("Option_name") String Option_name,
                                       @Param("Option_content") String Option_content);

    @Select("SELECT * FROM question WHERE question_type_id = #{question_type_id} ORDER BY RAND() LIMIT 0,#{number}")
    @Results({
            @Result(property = "pointList", column = "id",
                    many = @Many(select = "com.xdl.mapper.QuestionMapper.getKnowledgePointByQuestion_id")),
            @Result(property = "options", column = "id",
                    many = @Many(select = "com.xdl.mapper.QuestionMapper.getOptionsByQuestion_id")),
            @Result(property = "id", column = "id")
    })
    public List<Question> getRandomQuestionByQuestion_typeAndNumber(@Param("question_type_id") Integer question_type_id,
                                                                    @Param("number") Integer number);

    @Select("SELECT point_id FROM question_2_point WHERE question_id = #{question_id}")
    public List<Integer> getKnowledgePointByQuestion_id(@Param("question_id") Integer question_id);

    @Select("SELECT Option_content FROM question_2_option WHERE question_id = #{question_id}")
    public List<String> getOptionsByQuestion_id(@Param("question_id") Integer question_id);
}
