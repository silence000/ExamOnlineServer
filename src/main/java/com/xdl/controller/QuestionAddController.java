package com.xdl.controller;

import com.xdl.bean.Question;
import com.xdl.bean.QuestionType;
import com.xdl.services.QuestionAddService;
import org.springframework.stereotype.Controller;
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
    public int addQuestion(@RequestBody Question question){
        question.setPoints(100);
        return questionAddService.insertQuestion(question);
    }
}
