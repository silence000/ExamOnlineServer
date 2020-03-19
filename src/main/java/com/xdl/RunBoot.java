package com.xdl;

import com.xdl.mapper.QuestionMapper;
import com.xdl.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@MapperScan(basePackages = "com.xdl.mapper")
public class RunBoot {
    public static void main(String[] args) {
        SpringApplication.run(RunBoot.class);
    }
    @Test
    public void Test() {
        ApplicationContext applicationContext = SpringApplication.run(RunBoot.class);
        UserMapper userMapper = applicationContext.getBean(UserMapper.class);
        QuestionMapper questionMapper = applicationContext.getBean(QuestionMapper.class);
        System.out.println(questionMapper.getRandomQuestionByQuestion_typeAndNumber(1, 2));
    }
}
