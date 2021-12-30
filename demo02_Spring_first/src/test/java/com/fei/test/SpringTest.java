package com.fei.test;

import com.fei.dao.UserDao;
import com.fei.service.UserService;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

    @Test
    public void test1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //UserDao userDao = new UserDaoImpl();
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        userDao.saveUser();
    }
        /*
        * 从Spring容器中获得UserService对象,进行操作
        * */
    @Test
    public void test2() {
            ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
            //UserDao userDao = new UserDaoImpl();
            UserService userService = (UserService) applicationContext.getBean("userService");
            userService.saveUser();
    }

}
