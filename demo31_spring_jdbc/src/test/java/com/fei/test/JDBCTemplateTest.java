package com.fei.test;

import com.fei.dao.UserDao;
import com.fei.pojo.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class JDBCTemplateTest {
    // 使用JDBC模板API来进行相关的增删改查

    @Test
    public void save(){
        // 创建数据源
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/mybatis?characterEncoding=utf-8");
        dataSource.setUsername("root");
        dataSource.setPassword("rootroot");

        // 创建JDBC模板
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);

        // 操作数据库
        String sql = "insert into user(username,sex,birthday,address) values(?,?,?,?)";
        jdbcTemplate.update(sql,"李琳","女",null,"上海");


    }

    @Autowired
    private UserDao userDao2;

    @Test
    public void test01(){
        User user = userDao2.findUserById(6);
        System.out.println(user);
    }
}
