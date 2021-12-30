package com.fei.service.impl;

import com.fei.mapper.UserDao;
import com.fei.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    /*
    * @Autowired会自动的去完成实例的注入,前提时只有一个是实现类
    * @Qualifier,译为候选的意思,也就是说当有多个是实现类的时候,不止一个该类型的对象,找到了两个或多个bean
    *       通过该注解的属性名匹配对象的id,匹配上哪个就注入哪个
    *       该注解需要和@Autowired配合使用
    *
    * @Resource,可以根据类型注入,也可以根据id注入
    * */
/*    @Autowired
    @Qualifier("userDaoImpl1")*/

    @Resource(name = "userDaoImpl")
    private UserDao userDao;

    public void selectUser() {
        userDao.selectUser();
        System.out.println("UserServiceImpl selectUser() method running");
    }

    @PostConstruct
    public void init(){
        System.out.println("正在初始化");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("正在销毁对象");
    }
}
