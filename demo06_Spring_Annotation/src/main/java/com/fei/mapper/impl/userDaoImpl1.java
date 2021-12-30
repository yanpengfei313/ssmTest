package com.fei.mapper.impl;

import com.fei.mapper.UserDao;
import org.springframework.stereotype.Repository;

@Repository
public class userDaoImpl1 implements UserDao {

    public void selectUser() {
        System.out.println("UserDaoImpl111 selectUser() method running");
    }
}
