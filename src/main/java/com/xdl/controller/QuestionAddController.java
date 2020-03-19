package com.xdl.controller;

import com.xdl.bean.Question;
import com.xdl.bean.QuestionType;
import com.xdl.services.QuestionAddService;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class QuestionAddController {
    @Resource
    private QuestionAddService questionAddService;

    @RequestMapping(value = "/admin/QuestionManage/QuestionAdd/getQuestionType", method = RequestMethod.GET)
    @ResponseBody
    public List<QuestionType> getAllQuestionType(){
        return questionAddService.getAllQuestionType();
    }

    @RequestMapping(value = "/admin/QuestionManage/QuestionAdd/addQuestion", method = RequestMethod.POST)
    @ResponseBody
    @Transactional
    public int addQuestion(@RequestBody Question question){
        question.setPoints(100); // 手动设置满分分数为100
        System.out.println(question);
        int insertQuestion_2_option = 1;
        int flagQuestionAdd = questionAddService.insertQuestion(question);
        int flagQuestion_2_point = questionAddService.insertQuestion_2_point(question);
        if (question.getQuestion_type_id() == 1){
            insertQuestion_2_option = questionAddService.insertQuestion_2_option(question);
        }
        if (flagQuestionAdd == 1){
            if (flagQuestion_2_point == 1){
                if (insertQuestion_2_option == 1) {
                    return 1;
                }
            }
        }
        return 0;
    }
}
