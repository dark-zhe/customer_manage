package com.turing.customermanage.mapper;

import com.turing.customermanage.pojo.Menu;
import com.turing.customermanage.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {

    User login(String uname, String password);

    List<User> selectList();

    User addUser(User user);

    String authorityCheck1(User user);

    List<Menu> authorityCheck2(String[] split);

    boolean deleteUser(Integer uid);

    boolean updateUser(Integer uid,String uname, String password);
}
