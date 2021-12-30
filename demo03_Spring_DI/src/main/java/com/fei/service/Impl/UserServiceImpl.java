package com.fei.service.Impl;

import com.fei.mapper.UserDao;
import com.fei.service.UserService;

public class UserServiceImpl implements UserService {

    // 第一种: 有参构造函数的方式,将dao层对象注入到这里
    // 一旦定义了有参构造函数,那么核心配置文件中的bean装配就不可以使用了
    // 因为bean的装配默认的是无参构造函数,所以只能配置有参的bean
/*    private UserDao userDao;
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }*/

    // 第二种:set方法的方式,将dao层对象注入到这里,给到我们的成员属性UserDao对象
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }


    public void saveUser() {
        userDao.saveUser();
    }

}
