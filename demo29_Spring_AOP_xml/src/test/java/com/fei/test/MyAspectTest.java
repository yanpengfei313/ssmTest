package com.fei.test;

import com.fei.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class MyAspectTest {

    @Autowired
    private UserService userService;

    @Test
    public void test1(){
        userService.add();
    }

    @Test
    public void test2(){
        userService.deleteById(1);
    }

    @Test
    public void test3(){
        userService.update();
    }

    @Test
    public void test4(){
        userService.query();
    }
}
