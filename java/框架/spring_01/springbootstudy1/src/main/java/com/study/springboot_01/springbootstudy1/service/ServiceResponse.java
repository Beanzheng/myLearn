package com.study.springboot_01.springbootstudy1.service;

import com.study.springboot_01.springbootstudy1.dao.UserMapper;
import com.study.springboot_01.springbootstudy1.entity.UserBean;
import org.springframework.beans.factory.annotation.Autowired;

public class ServiceResponse {
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private int code;
    private String message;
    @Autowired
    public UserMapper userMapper;

    public UserBean getUser(){
        return userMapper.getAllUser();
    }


}
