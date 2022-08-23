package com.turing.customermanage.service;

import com.turing.customermanage.pojo.User;

public interface UserService {
    User login(String uname, String password);
}
