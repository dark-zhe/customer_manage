package com.turing.customermanage.service;

import com.turing.customermanage.pojo.User;

import java.util.List;

public interface UserService {
    User login(String uname, String password);

    //查询所有user
    List<User> selectList();

    User addUser(User user);
}
