package com.turing.customermanage.controller;

import com.alibaba.fastjson.JSON;
import com.turing.customermanage.pojo.Menu;
import com.turing.customermanage.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RequestMapping("menu")
@Controller
public class MenuController {

    @Autowired
    private MenuService menuService;

    @GetMapping(value = "/findMenus/{uid}",produces = "application/json;charset=utf-8")
    public void findMenus(@PathVariable int uid, HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<Menu> menus= menuService.findMenus(uid);
        response.getWriter().write(JSON.toJSONString(menus));
    }
}
