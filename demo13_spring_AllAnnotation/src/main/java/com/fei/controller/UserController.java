package com.fei.controller;

import com.fei.pojo.User;
import com.fei.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    public List<User> findAllUser(){
        return userService.findAllUser();
    }

    public User findUserById(Integer id){
        return userService.findUserById(id);
    }

    public void deleteById(Integer id) {
        userService.deleteById(id);
    }

    public void addUser(User user) {
        userService.addUser(user);
    }


    public void updateUSerById(User user) {
        userService.updateUSerById(user);
    }
}
