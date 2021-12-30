package com.fei.dao;


import com.fei.pojo.User;

public interface UserDao {

    User findUserById(Integer id);

    User findUserByUsername(String username);

    void updateUser(User user);
}
