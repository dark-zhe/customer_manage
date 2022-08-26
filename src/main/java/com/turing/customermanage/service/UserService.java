package com.turing.customermanage.service;

import com.turing.customermanage.pojo.Menu;
import com.turing.customermanage.pojo.User;

import java.util.List;

public interface UserService {
    User login(String uname, String password);

    //查询所有user
    List<User> selectList();



    boolean deleteUser(Integer uid);

    boolean updateUser(Integer uid,String uname, String password);

    int addUser(String uname, String password);
}
