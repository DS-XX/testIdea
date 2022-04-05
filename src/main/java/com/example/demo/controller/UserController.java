package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    UserMapper userMapper;

    @GetMapping("/list")
    public List<User> getUser() {
        return userMapper.findAll();
    }

    @GetMapping("/name")
    public List<User> getName() {
        List<User> a = userMapper.findName();
        System.out.println(a);
        return a;
    }

    @PostMapping("/createName")
    public List<User> createName(User params) {
        System.out.println(params);
        return userMapper.createName();
    }


//    @PostMapping("/test")
//    public  String postUser(){
//        return "postUser";
//    }
}
