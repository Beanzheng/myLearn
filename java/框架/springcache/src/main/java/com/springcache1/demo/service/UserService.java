package com.springcache1.demo.service;

import com.springcache1.demo.entity.UserEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    List<UserEntity> getAllUser();
    List<UserEntity> getUser();
}
