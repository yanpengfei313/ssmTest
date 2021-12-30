package com.fei;

import com.fei.mapper.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class stringTest {

    @Test
    public void test(){
        // 从spring容器中获取accountDao的代理对象
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        System.out.println(userDao.FindAllUser());
    }
}
