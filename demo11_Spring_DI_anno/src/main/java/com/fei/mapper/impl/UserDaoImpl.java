package com.fei.mapper.impl;

import com.fei.mapper.UserDao;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    public void addUser() {
        System.out.println("UserDaoImpl addUser method running...");
    }
}
