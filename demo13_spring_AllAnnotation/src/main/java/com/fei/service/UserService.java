package com.fei.service;

import com.fei.pojo.User;

import java.util.List;

public interface UserService {

    List<User> findAllUser();

    User findUserById(Integer id);

    void deleteById(Integer id);

    void addUser(User user);

    void updateUSerById(User user);
}
