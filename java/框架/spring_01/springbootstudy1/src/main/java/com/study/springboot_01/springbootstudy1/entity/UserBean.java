package com.study.springboot_01.springbootstudy1.entity;

import com.study.springboot_01.springbootstudy1.common.StartWithValidation;
import org.springframework.context.annotation.Bean;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
public class UserBean {
    @NotBlank
    @Size(max = 10)
    public String name;
    public String password;
    @StartWithValidation(message = "Param 'address' must be start with 'Beijing'.", start = "Beijing")
    public String address;
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
