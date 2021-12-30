package com.fei.service.impl;

import com.fei.service.UserService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
/*
<bean id= userServiceImpl class =com.fei.service.UserServiceImpl
*/
@Scope("prototype")
@Component
public class UserServiceImpl implements UserService {
    public void addUser() {

    }
}
