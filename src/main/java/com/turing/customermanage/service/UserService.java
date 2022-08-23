package com.turing.customermanage.service;

import com.turing.customermanage.pojo.User;

import java.util.List;

public interface UserService {
    List<User> login(String uname, String password);
}
