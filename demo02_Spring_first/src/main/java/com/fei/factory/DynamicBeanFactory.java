package com.fei.factory;

import com.fei.dao.UserDao;
import com.fei.dao.impl.UserDaoImpl;

public class DynamicBeanFactory {

    public UserDao createUserDao(){
        return new UserDaoImpl();
    }
}
