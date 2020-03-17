package com.xdl.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

public interface QuestionMapper {
    @Insert("INSERT INTO question (desccription, question_type_id, points, group_id, is_visible, create_time, last_modify, answer, difficulty, analysis, reference, examing_point, keyword) VALUES (#{desccription},#{question_type_id},#{points},1,1,SYSDATE(),SYSDATE(),#{answer},#{difficulty},#{analysis},#{reference},#{examing_point},#{keyword});")
    public int insertQuestion(@Param("desccription") String desccription,
                              @Param("question_type_id") Integer question_type_id,
                              @Param("points") Integer points,
                              @Param("answer") String answer,
                              @Param("difficulty") Double difficulty,
                              @Param("analysis") String analysis,
                              @Param("reference") String reference,
                              @Param("examing_point") String examing_point,
                              @Param("keyword") String keyword
                              );
}
