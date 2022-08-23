package com.turing.customermanage.controller;

import com.turing.customermanage.pojo.User;
import com.turing.customermanage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RequestMapping("user")
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/login/{uname}/{password}")
    //@ResponseBody
    public User login(@PathVariable("uname")String uname, @PathVariable("password")String password, HttpServletRequest request, HttpServletResponse response){
        System.out.println("________________________________________________________");
        User user = userService.login(uname, password);
        System.out.println(user);
        return user;
    }
    @PostMapping("findAll")
    public List<User> selectList(){
        return userService.selectList();
    }
    @PostMapping("/addUser")
    public User addUser(User user){
        User user1 = userService.addUser(user);
        return user1;
    }
}
