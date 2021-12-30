package com.fei.text;

import com.fei.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

    @Test
    public void test1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 我需要从Spring容器中获取UserServiceImpl的实例对象
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.saveUser();
    }




}
