package com.fei;

import com.fei.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void test01(){
        // 1. 直接创建Spring的核心容器,同时要指定加载类路径下的xml核心配置文件
        // 在创建核心容器的时候,就已经读取了整个核心配置文件,而且就已经创建好了配置文件里面的所有bean标签对应的对象
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.mxl");
        // 2. 调用核心容器的方法,根据id来获取对象
        // 使用接口来接受实现类的对象也是出于解耦的操作[多态的作用]
        UserService userService = context.getBean("userService", UserService.class);
    }

    @Test
    public void test02(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.mxl");
        UserService userService = context.getBean("userService", UserService.class);
        UserService userService2 = context.getBean("userService", UserService.class);

        System.out.println(userService == userService2);
    }

    /*
    *  了解一下Spring的工厂模式
    * */
    @Test
    public void test05(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.mxl");

    }
}
