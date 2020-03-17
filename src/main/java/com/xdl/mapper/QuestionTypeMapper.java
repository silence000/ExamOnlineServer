package com.xdl.mapper;

import com.xdl.bean.QuestionType;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface QuestionTypeMapper {
    @Select("SELECT * FROM question_type")
    public List<QuestionType> getAllQuestionType();
}
