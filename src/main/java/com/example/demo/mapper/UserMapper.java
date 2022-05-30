package com.example.demo.mapper;

import java.util.List;
import com.example.demo.entity.User;

public interface UserMapper {
    List findAll();
    List findName(String user);
    List createName(User user);
    List login(User user);
}
