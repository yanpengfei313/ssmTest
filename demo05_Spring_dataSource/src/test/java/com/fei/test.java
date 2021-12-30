package com.fei;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class test {

    @Test
    public void testC3P0() throws PropertyVetoException, SQLException {
        // 创建数据源
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        // 设置数据源的连接参数
        dataSource.setDriverClass("com.mysql.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql:///mybatis");
        dataSource.setUser("root");
        dataSource.setPassword("rootroot");
        // 获取连接对象
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
    }

    @Test
    public void testDruid() throws SQLException {
        // 创建数据源
        DruidDataSource dataSource = new DruidDataSource();
        // 设置数据源的连接参数
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql:///mybatis");
        dataSource.setUsername("root");
        dataSource.setPassword("rootroot");
        // 获取连接对象
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
    }

    @Test
    public void testByProperties() throws Exception {
        // 加载类路径下的jdbc.properties
        ResourceBundle jdbc = ResourceBundle.getBundle("jdbc");
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass(jdbc.getString("jdbc.driver"));
        dataSource.setJdbcUrl(jdbc.getString("jdbc.url"));
        dataSource.setUser(jdbc.getString("jdbc.username"));
        dataSource.setPassword(jdbc.getString("jdbc.password"));
        // 获取连接对象
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
    }

    @Test
    public void testSpring() throws SQLException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        DataSource dataSource = (DataSource) applicationContext.getBean("dataSource");
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
    }
}
