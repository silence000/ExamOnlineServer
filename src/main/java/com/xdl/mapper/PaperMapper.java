package com.xdl.mapper;

import com.xdl.bean.Paper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;

public interface PaperMapper {
    @Insert("INSERT INTO paper (name, duration, total_point, pass_point, is_visible, status, create_time, summary, is_subjective, answer_sheet, creator, difficulty) VALUES (#{name},#{duration}, #{total_point},#{pass_point},1,#{status},SYSDATE(),#{summary},1,#{answer_sheet},#{creator},#{difficulty})")
    @Options(useGeneratedKeys = true, keyColumn = "id", keyProperty = "id")
    public int insertPaper(Paper paper);

    @Insert("INSERT INTO paper_2_question (paper_id, question_id, order_num) VALUES (#{paper_id},#{question_id},#{order_num})")
    public int insertPaper_2_question(@Param("paper_id") Integer paper_id,
                                      @Param("question_id") Integer question_id,
                                      @Param("order_num") Integer order_num);
}
