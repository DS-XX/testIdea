package com.example.demo.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class User extends BaseEntity implements Serializable {
    private Integer id;
    private String loginName;
    private String password;
}
