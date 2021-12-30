package com.fei.mapper;

import com.fei.pojo.User;

import java.sql.SQLException;
import java.util.List;

public interface UserMapper {

    List<User> findAllUser();

    User findUserById(Integer id);

    void deleteById(Integer id);

    void addUser(User user);

    void updateUSerById(User user);
}
