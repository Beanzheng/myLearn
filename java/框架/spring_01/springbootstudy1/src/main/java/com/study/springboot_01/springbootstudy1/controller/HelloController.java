package com.study.springboot_01.springbootstudy1.controller;

import com.study.springboot_01.springbootstudy1.entity.UserBean;
import com.study.springboot_01.springbootstudy1.service.ServiceResponse;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class HelloController {
    @RequestMapping("/hello/{uid}")
    public String hello(@PathVariable("uid")Integer id, Map<String,Object> map){
        map.put("name","张三");
        System.out.println("uid："+id);
        return "index";
    }
    @RequestMapping(value = "/validation/get", method = RequestMethod.GET)
    public ServiceResponse validateGet (@Validated UserBean userBean){
        ServiceResponse serviceResponse = new ServiceResponse();
        serviceResponse.setCode(0);
        serviceResponse.setMessage("test");
        return serviceResponse;

    }
}
