package com.study.springboot_01.springbootstudy1.controller;

import com.study.springboot_01.springbootstudy1.entity.UserBean;
import com.study.springboot_01.springbootstudy1.service.ServiceResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class HelloController {
    ServiceResponse serviceResponse = new ServiceResponse();
    private static Logger logger = LoggerFactory.getLogger(HelloController.class);
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
    @GetMapping("/hell")
    public String test(){
        logger.info("从这里切入");
        return "没错，就是这里";
    }

//    @RequestMapping(value = "/getuser", method = RequestMethod.POST)
//    public UserBean getUser(){
//        return serviceResponse.getUser();
//    }
}
