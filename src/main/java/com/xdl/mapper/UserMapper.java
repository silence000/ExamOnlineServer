package com.xdl.mapper;

import com.xdl.bean.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    @Select("SELECT * FROM USER WHERE USERNAME = #{username} AND PASSWORD = #{password}")
    public List<User> getUserByUsernameAndPassword(@Param("username") String username, @Param("password") String password);

}
