package com.study.springboot_01.springbootstudy1.common;


import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

public class WebMvcConfigurer extends WebMvcConfigurationSupport {
    public void addInterceptors(InterceptorRegistry registry){
        /**
         * 配置拦截器
         */
        registry.addInterceptor(new OneMvcConfig()).addPathPatterns("/*/**").addPathPatterns("/hello");
        super.addInterceptors(registry);
    }

}
