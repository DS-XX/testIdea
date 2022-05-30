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
    @RequestMapping("/test")
    public User getTest(){
        User user = new User();
        user.setId(1);
        user.setPassword("4");
        System.out.println(user);
        return user;
    }

    @GetMapping("/list")
    public List getUser() {
        System.out.println("diaoyonlezhege fangfa");
        return userMapper.findAll();
    }

    @GetMapping("/name")
    public List getName(String loginName) {
        List a = userMapper.findName(loginName);
        System.out.println(a);
        return a;
    }

    @PostMapping("/createName")
    public List createName(@RequestBody User params) {
        if(params.getLoginName()!=null){
            List useName = userMapper.findName(params.getLoginName());
            if(useName==null){
                return userMapper.createName(params);
            }
        }
        return null;
    }

    @PostMapping("/login")
    public List loginName(@RequestBody User params) {
        String loginName = params.getLoginName();
        String password = params.getPassword();
        if(loginName!=null && password != null){
            List x = userMapper.login(params);
            System.out.println(x+"this is back list");
        }
        return null;
    }
//    @PostMapping("/test")
//    public  String postUser(){
//        return "postUser";
//    }
}
