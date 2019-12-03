package com.springcache1.demo.service.Impl;

import com.springcache1.demo.entity.UserEntity;
import com.springcache1.demo.service.UserService;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;

@CacheConfig(cacheNames = {""})
public class UserServiceImpl implements UserService {

    @Override
    @Cacheable(key = "targetClass + methodName +#p0")
    public List<UserEntity> getAllUser() {
        return null;
    }

    @Override
    public List<UserEntity> getUser() {
        return null;
    }
}
