package com.springcache1.demo.dao;

import com.springcache1.demo.entity.UserEntity;

import java.util.List;

public interface UserDao {
    List<UserEntity> getAllUser();
    List<UserEntity> getUser();
}
