package com.xdl.services;

import com.xdl.bean.User;
import com.xdl.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class LoginRegisterService {
    @Resource
    private UserMapper userMapper;

    public User userLogin(String username, String password) {
        if (userMapper.getUserByUsernameAndPassword(username, password).isEmpty()) {
            return null;
        } else {
            return userMapper.getUserByUsernameAndPassword(username, password).get(0);
        }
    }
}
