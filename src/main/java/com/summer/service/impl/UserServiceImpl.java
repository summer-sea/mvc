package com.summer.service.impl;

import com.summer.mapper.UserMapper;
import com.summer.pojo.User;
import com.summer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getUser(String id) {
        return userMapper.getUser(id);
    }
}
