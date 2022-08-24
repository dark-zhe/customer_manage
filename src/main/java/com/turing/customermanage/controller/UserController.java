package com.turing.customermanage.controller;

import com.turing.customermanage.pojo.Menu;
import com.turing.customermanage.pojo.User;
import com.turing.customermanage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;
import java.util.List;

@RequestMapping("user")
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/login/{uname}/{password}")
    //@ResponseBody
    public List<Menu> login(@PathVariable("uname")String uname, @PathVariable("password")String password){
        System.out.println("________________________________________________________");
        User user = userService.login(uname, password);
        List<Menu> menus = userService.authorityCheck1(user);
        System.out.println(menus.toString());
        System.out.println(user);
        return menus;
    }
    //查
    @GetMapping("findAll")
    public List<User> selectList(){
        return userService.selectList();
    }

    //增
    @PostMapping("/addUser")
    @ResponseBody
    public User addUser(User user){
        User user1 = userService.addUser(user);
        return user1;
    }
    //删
    @GetMapping("/deleteUser/{uid}")
    public boolean deleteUser(@PathVariable("uid") Integer uid){
        boolean res = userService.deleteUser(uid);
        System.out.println(res);
        return res;
    }
    //改
    //@RequestMapping(value = "/updateUser",method = RequestMethod.POST)
    @PostMapping("/updateUser")
    public boolean updateUser(@RequestParam("uid") Integer uid,
                              @RequestParam("uname") String uname,
                              @RequestParam("password") String password){
        boolean res = userService.updateUser(uid,uname,password);
        System.out.println(res);
        return res;
    }

}
