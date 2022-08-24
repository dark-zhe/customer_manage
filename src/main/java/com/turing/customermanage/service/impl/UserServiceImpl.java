package com.turing.customermanage.service.impl;

import com.turing.customermanage.mapper.UserMapper;
import com.turing.customermanage.pojo.Menu;
import com.turing.customermanage.pojo.User;
import com.turing.customermanage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(String uname, String password) {
        return userMapper.login(uname, password);
    }

    @Override
    public List<User> selectList() {

        return userMapper.selectList();
    }

    @Override
    public User addUser(User user) {
        return userMapper.addUser(user);
    }

    @Override
    public List<Menu> authorityCheck1(User user) {
        String mid = userMapper.authorityCheck1(user);
        String[] split = mid.split(",");
        return userMapper.authorityCheck2(split);
    }

    @Override
    public boolean deleteUser(Integer uid) {
        boolean res = userMapper.deleteUser(uid);
        return res;
    }

    @Override
    public boolean updateUser(Integer uid,String uname, String password) {
        return userMapper.updateUser(uid,uname,password);
    }
}
