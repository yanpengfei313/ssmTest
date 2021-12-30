package com.fei.text;

import com.fei.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    @Test
    public void test1(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserServiceImpl userServiceImpl = applicationContext.getBean("userServiceImpl", UserServiceImpl.class);

        userServiceImpl.selectUser();
        applicationContext.close();

/*        UserDao userDao = (UserDao) applicationContext.getBean("userDaoImpl1");
        userDao.selectUser();*/
    }
}
