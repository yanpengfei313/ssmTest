package com.fei;

import com.fei.dao.UserDao;
import com.fei.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class UserTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void test1(){
        List<User> user = userDao.findUser();
        System.out.println(user);
    }


}
