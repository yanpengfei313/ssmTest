package com.fei.controller;

import com.fei.pojo.Result;
import com.fei.pojo.User;
import com.fei.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@ResponseBody // 该注解放在类上表示所有的controller方法返回的都是json格式
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/findAll")
    public Result findAll(){
        List<User> userList = userService.findAll();
        try {
            Result result = new Result(true,userList,"查询成功");
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            Result result = new Result(false,null,"查询失败");
            return result;
        }
    }

    @RequestMapping("/{uid}")
    public Result deleteById(@PathVariable("uid") int uid){
        userService.deleteById(uid);
        try {
            Result result = new Result(true,null,"删除用户信息成功");
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            Result result = new Result(false,null,"删除用户信息失败");
            return result;
        }
    }

    @RequestMapping("/addUser")
    public Result addUser(@RequestBody User user){
        userService.addUser(user);
        try {
            Result result = new Result(true,null,"保存用户信息成功");
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            Result result = new Result(false,null,"保存用户信息失败");
            return result;
        }

    }
}
