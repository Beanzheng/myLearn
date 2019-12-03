package com.study.springboot_01.springbootstudy1.dao;

import com.study.springboot_01.springbootstudy1.entity.UserBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * mybatis注解应用
 */
@Mapper
public interface UserMapper {
    @Select("select name,password from user")
    UserBean getAllUser();
}
