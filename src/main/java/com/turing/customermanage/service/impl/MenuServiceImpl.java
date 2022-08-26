package com.turing.customermanage.service.impl;

import com.turing.customermanage.mapper.MenuMapper;
import com.turing.customermanage.pojo.Menu;
import com.turing.customermanage.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("menuService")
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuMapper menuMapper;

    @Override
    public List<Menu> findMenus(Integer uid) {
        String mid = menuMapper.findMids(uid);
        String[] split = mid.split(",");
        return menuMapper.findMenus(split);
    }
}
