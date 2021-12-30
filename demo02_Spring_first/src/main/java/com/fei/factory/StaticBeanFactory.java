package com.fei.factory;

import com.fei.dao.UserDao;
import com.fei.dao.impl.UserDaoImpl;

public class StaticBeanFactory {

    public static UserDao createUserDao(){
        return new UserDaoImpl();
    }
}
