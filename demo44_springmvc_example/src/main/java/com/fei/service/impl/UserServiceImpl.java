package com.fei.service.impl;

import com.fei.dao.UserDao11;
import com.fei.pojo.User;
import com.fei.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao11 userDao11;
    @Override
    public List<User> findAll() {
        return userDao11.findAll();
    }

    @Override
    public void deleteById(int uid) {
        userDao11.deleteById(uid);
    }

    @Override
    public void addUser(User user) {
        userDao11.addUser(user);
    }
}
