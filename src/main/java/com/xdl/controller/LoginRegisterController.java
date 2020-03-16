package com.xdl.controller;

import com.xdl.bean.User;
import com.xdl.services.LoginRegisterService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class LoginRegisterController {
    @Resource
    private LoginRegisterService loginRegisterService;

    @RequestMapping(value = "/user/login", method = RequestMethod.POST)
    @ResponseBody
    public User loginVerify(String username, String password){
        return loginRegisterService.userLogin(username, password);
    }

}
