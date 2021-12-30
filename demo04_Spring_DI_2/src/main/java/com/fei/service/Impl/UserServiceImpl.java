package com.fei.service.Impl;

import com.fei.pojo.User;
import com.fei.service.UserService;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class UserServiceImpl implements UserService {


    // 普通数据类型的注入
    private String username;
    private Integer age;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    // 集合数据[List]的注入
    private List<String> stringList;
    private List<User> userList;
    private Map<String,User> userMap;
    private Properties properties;

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void setUserMap(Map<String, User> userMap) {
        this.userMap = userMap;
    }



    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }


    public void saveUser() {
        System.out.println(username+","+age);
        System.out.println(stringList);
        System.out.println(userList);
        System.out.println(userMap);
        System.out.println(properties);
        System.out.println("user Service save method running");
    }

}
