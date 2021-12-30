package com.fei.dao;

import com.fei.pojo.User;


import java.util.List;


public interface UserDao {

    List<User> findUser();
}
