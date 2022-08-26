package com.turing.customermanage.controller;

import com.alibaba.fastjson.JSON;
import com.turing.customermanage.pojo.User;
import com.turing.customermanage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RequestMapping("user")
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/login/{uname}/{password}")
    @ResponseBody
    public int login(@PathVariable("uname") String uname, @PathVariable("password") String password, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        User user = userService.login(uname, password);
        if (user!=null){
            return user.getUid();
        }else {
            request.getRequestDispatcher("login.html").forward(request,response);
        }
        return 0;
    }

    //查
    @GetMapping("findAll")
    public List<User> selectList() {
        return userService.selectList();
    }

    //增
    @GetMapping("/addUser/{uname}/{password}")
    public boolean addUser(@PathVariable("uname") String uname, @PathVariable("password") String password) {
        return userService.addUser(uname,password)>0;
    }

    //删
    @GetMapping("/deleteUser/{uid}")
    public boolean deleteUser(@PathVariable("uid") Integer uid) {
        boolean res = userService.deleteUser(uid);
        System.out.println(res);
        return res;
    }

    //改
    //@RequestMapping(value = "/updateUser",method = RequestMethod.POST)
    @PostMapping("/updateUser")
    public boolean updateUser(@RequestParam("uid") Integer uid,
                              @RequestParam("uname") String uname,
                              @RequestParam("password") String password) {
        boolean res = userService.updateUser(uid, uname, password);
        System.out.println(res);
        return res;
    }

}
