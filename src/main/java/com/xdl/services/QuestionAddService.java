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
        return questionMapper.insertQuestion(question);
    }

    public int insertQuestion_2_point(Question question){
        int status = 0;
        for (int i = 0; i < question.getPointList().size(); i++) {
            status = questionMapper.insertQuestion_2_point(question.getId(), question.getPointList().get(i));
            if (status == 0) {
                return 0;
            }
        }
        return 1;
    }

    public int insertQuestion_2_option(Question question) {
        int status = 0;
        String [] optionName = {"A", "B", "C", "D"};
        for (int i = 0; i < question.getOptions().size(); i++) {
            status = questionMapper.insertQuestion_2_option(question.getId(), optionName[i], question.getOptions().get(i));
            if (status == 0) {
                return 0;
            }
        }
        return 1;
    }
}
