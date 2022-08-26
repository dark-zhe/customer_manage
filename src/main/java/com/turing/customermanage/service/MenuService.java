package com.turing.customermanage.service;

import com.turing.customermanage.pojo.Menu;

import java.util.List;

public interface MenuService {
    List<Menu> findMenus(Integer uid);
}
