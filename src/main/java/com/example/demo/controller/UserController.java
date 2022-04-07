package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    UserMapper userMapper;

    @GetMapping("/list")
    public User getUser() {
        return userMapper.findAll();
    }

    @GetMapping("/name")
    public String getName(String loginName) {
        String a = userMapper.findName(loginName);
        System.out.println(a);
        return a;
    }

    @PostMapping("/createName")
    public Integer createName(@RequestBody User params) {
        if(params.getLoginName()!=null){
            String useName = userMapper.findName(params.getLoginName());
            if(useName==null){
                return userMapper.createName(params);
            }
        }
        return 0;
    }


//    @PostMapping("/test")
//    public  String postUser(){
//        return "postUser";
//    }
}
