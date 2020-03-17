package com.xdl.services;

import com.xdl.bean.Question;
import com.xdl.bean.QuestionType;
import com.xdl.mapper.QuestionMapper;
import com.xdl.mapper.QuestionTypeMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class QuestionAddService {
    @Resource
    private QuestionTypeMapper questionTypeMapper;
    @Resource
    private QuestionMapper questionMapper;

    public List<QuestionType> getAllQuestionType() {
        return questionTypeMapper.getAllQuestionType();
    }
    public int insertQuestion(Question question) {
        return questionMapper.insertQuestion(
                question.getDesccription(),
                question.getQuestion_type_id(),
                question.getPoints(),
                question.getAnswer(),
                question.getDifficulty(),
                question.getAnalysis(),
                question.getReference(),
                question.getExaming_point(),
                question.getKeyword()
        );
    }
}
