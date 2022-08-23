package com.turing.customermanage.mapper;

import com.turing.customermanage.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository
public interface UserMapper {
    User login(String uname, String password);
}
