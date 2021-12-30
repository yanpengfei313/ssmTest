package com.fei.mapper.impl;

import com.fei.mapper.UserDao;

public class UserDaoImpl  implements UserDao {

    @Override
    public void saveUser() {
        System.out.println("userDao save method running");
    }
}
