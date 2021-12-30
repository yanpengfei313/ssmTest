package com.fei.service.impl;

import com.fei.mapper.UserDao;
import com.fei.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Value("张三")
    private String nickname;

    @Autowired
    private UserDao userDao;

    public void addUser() {
        System.out.println("UserServiceImpl addUser method running...");
        userDao.addUser();
    }
}
