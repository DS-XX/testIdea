package com.example.demo.mapper;

import java.util.List;
import com.example.demo.entity.User;

public interface UserMapper {
    User findAll();
    String findName(String user);
    Integer createName(User user);
}
