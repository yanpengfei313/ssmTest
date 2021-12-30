package com.fei.controller;

import com.fei.pojo.User;
import jdk.nashorn.internal.ir.Module;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*
* SpringMVC中,Controller配置一些方法来接收请求
*   1. IOC配置,所有的controller对象都要配置到spring的核心容器中来统一管理
*   2. 进行映射路径的配置, 在要处理请求的方法上添加注解@RequestMapping来配置映射配置路径
*   3. 在web.xml配置文件中,配置DispatcherServlet的映射路径,并且配置服务器启动时加载
*   4. 告诉DispatcherServlet,要加载的spring,springmvc的配置文件的路径,告诉servlet的初始化参数
*
* 配置跳转到成功页面
*   1. 配置视图解析器,在spring的配置文件中来配置,将controller的方法的返回值进行解析,解析成真正的试图地址
*   2. 让controller的方法,返回一个字符串,这个字符串可以匹配视图解析器上的字符串
* */
@RequestMapping("/user")
@Controller
public class UserController {

    @RequestMapping("/register")
    public String register(User user){
        System.out.println("注册的用户："+user);
        return "success";
    }

    @RequestMapping("/returnModelAndView")
    public ModelAndView returnModelAndView(){

        // 初始化数据模型视图
        ModelAndView modelAndView = new ModelAndView();
        // 数据模型视图对象绑定一个视图的名称，同时还要绑定一些数据【会将数据存储到requestd域对象中】
        modelAndView.setViewName("success");
        modelAndView.addObject("username","张三");
        modelAndView.addObject("password","123456");
        // 返回数据模型视图，同样会去找视图解析器，解析viewName，使用请求转发跳转到对象的视图上面
        return modelAndView;
    }


    // 转发
    @RequestMapping("methodForward")
    public String methodForward(){
        System.out.println("请求转发");
        // return "success";
        //return "forward:/WEB-INF/pages/success.jsp";// 就不会通过视图解析器进行解析了
        //return "forward:/user/returnModelAndView";// 转发到其他的控制器上

        // 因为重定向实际上是客户端再次向服务器发送请求，所以无法访问WEB-INF目录
        //return "redirect:/register.jsp";// 重定向到register页面
        return "redirect:/user/returnModelAndView";// 重定向到其他的控制器上
    }


    @RequestMapping("/responseJson")
    @ResponseBody
    public User responseJson(){
        // 模拟数据库获取User
        User user = new User();
        user.setUsername("张三");
        user.setPassword("123456");
        user.setNickname("三三");
        user.setBirthday(new Date());
        List<String> hobbies = new ArrayList<>();
        hobbies.add("basketball");
        hobbies.add("football");
        user.setHobbies(hobbies);

        // 将User对象响应给客户端，转成json格式
        return user;
    }
}
