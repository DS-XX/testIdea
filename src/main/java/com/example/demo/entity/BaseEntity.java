package com.example.demo.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
@Data
public class BaseEntity {
    public class BaseEntiry implements Serializable{
        private String createdUser;
        private Date createdTime;
        private String modifiedUser;
        private  Date modifiedTime;
    }

}
