package com.turing.customermanage.service.impl;

import com.turing.customermanage.mapper.UserMapper;
import com.turing.customermanage.pojo.User;
import com.turing.customermanage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(String uname, String password) {
        return userMapper.login(uname, password);
    }
}
