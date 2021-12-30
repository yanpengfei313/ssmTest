package com.fei.mapper.impl;

import com.fei.mapper.UserDao;
import org.springframework.stereotype.Repository;

@Repository
public class userDaoImpl implements UserDao {

    public void selectUser() {
        System.out.println("UserDaoImpl selectUser() method running");
    }
}
