package com.turing.customermanage.mapper;

import com.turing.customermanage.pojo.Menu;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuMapper {
    String findMids(Integer uid);

    List<Menu> findMenus(String[] split);
}
