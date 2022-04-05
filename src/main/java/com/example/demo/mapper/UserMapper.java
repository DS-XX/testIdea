package com.example.demo.mapper;

import java.util.List;
import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {
    @Select("select * from user")
    List<User> findAll();
    @Select("select name from user")
    List<User> findName();
    @Select("")
    List<User> createName();
}
