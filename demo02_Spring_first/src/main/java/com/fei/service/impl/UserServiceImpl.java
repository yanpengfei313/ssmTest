package com.fei.service.impl;

import com.fei.service.UserService;

public class UserServiceImpl implements UserService {

    /*
    * 【依赖注入的简单方式】
    * 在saveUser()方法中调用UserDao的saveUser()方法
    * */
    public void saveUser() {
        System.out.println("hello");
        // 原始的依赖注入
        /*ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        userDao.saveUser();*/


    }

}
