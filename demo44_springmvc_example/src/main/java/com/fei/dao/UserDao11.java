package com.fei.dao;

import com.fei.pojo.User;

import java.util.List;

public interface UserDao11 {
    // 查询所用用户信息
    List<User> findAll();

    // 根据id删除用户
    void deleteById(int uid);

    // 添加用户
    void addUser(User user);
}
