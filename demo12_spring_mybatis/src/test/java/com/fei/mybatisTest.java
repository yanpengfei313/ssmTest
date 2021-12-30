package com.fei;

import com.fei.controller.UserController;
import com.fei.mapper.UserMapper;
import com.fei.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;
import java.io.Reader;
import java.util.List;
/*
 * 单元测试方法其实就是在Junit框架中的main方法中执行的
 *
 * 之前我们都是自己创建ApplicationContext,然后点击测试运行,其实就是在Junit调用的方法来运行起来的
 *
 * 我们现在要让Junit直接帮我们创建核心容器:使用spring整合Junit
 *   1. 引入依赖
 *   2. Junit的以来版本必须是4.12以上
 *   3. 添加注解RunWith即可
 *   4. 主要让Junit能够知道去加载哪个配置文件或者加载哪个配置类
 * */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring.xml"})
public class mybatisTest {

    @Autowired
    private UserMapper userMapper;
    @Test
    public void test1() throws IOException {
        // 1.创建Builder对象
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        // 2. 加载核心配置文件
        Reader reader = Resources.getResourceAsReader("sqlMapperConfig.xml");
        // 3. 通过builder来构建factory对象，一个项目中一般就一个工厂对象【核心对象】
        SqlSessionFactory factory = builder.build(reader);
        // 4. 执行sql语句，我们就应该创建一个sqlSession对象
        SqlSession sqlSession = factory.openSession();
        // 5. 通过sqlSession对象来创建Dao层的代理对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        // 6. 通过代理对象调用dao层接口中的方法
        List<User> list = mapper.findAllUser();
        System.out.println(list);


        // 7. 关闭资源
        sqlSession.close();
    }

    @Test
    public void test2(){
        List<User> allUser = userMapper.findAllUser();
        System.out.println(allUser);
    }

    @Test
    public void test3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        UserController userController = (UserController) context.getBean("userController");
        User user = new User("张发财","男",null,"陕西");
        userController.addUser(user);
    }
}
