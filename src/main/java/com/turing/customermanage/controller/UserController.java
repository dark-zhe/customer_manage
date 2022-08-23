package com.turing.customermanage.controller;

import com.turing.customermanage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RequestMapping("user")
@Controller
public class UserController {
    @Autowired
    private UserService userService;


    @GetMapping("/login/{uname}/{password}")
    public void login(@PathVariable("uname")String uname, @PathVariable("password")String password, HttpServletRequest request, HttpServletResponse response){
        System.out.println("________________________________________________________");
        System.out.println(userService.login(uname,password));
    }
}
