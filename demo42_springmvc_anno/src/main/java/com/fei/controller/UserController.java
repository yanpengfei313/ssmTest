package com.fei.controller;

import com.fei.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

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
@SessionAttributes(value = {"msg"})
public class UserController {


    @RequestMapping("/register")
    public String register(User user){
        System.out.println("注册的用户："+user);
        return "success";
    }

    @RequestMapping("/userJson")
    public String userJson(@RequestBody User user){
        // 目标：使用body参数来获取请求体中的内容，从请求体中获取参数，封装到User实体类对象中
        System.out.println("请求体的内容："+user);
        return "success";
    }

    /*
     * 请求检查一个订单，订单有订单id，订单对应的套餐id，再来一个结果id
     * 传统方式：http://127.0.0.1:8080/user?orderId=100100&mealId=111000&resultId=20211212
     * Rest：get请求方式   http://127.0.0.1:8080/user/100100/111000/20211212
     * */
    @RequestMapping(path = "/{orderId}/{mealId}/{resultId}",method = RequestMethod.GET)
    public String checkItem(@PathVariable("orderId")int orderId,@PathVariable("mealId")int mealId,@PathVariable("resultId")int resultId){
        // 目标：使用body参数来获取请求体中的内容，从请求体中获取参数，封装到User实体类对象中
        System.out.println("根据id进行检查：orderId:"+orderId+",mealId:"+mealId+",resultId:"+resultId);
        return "success";
    }

    @RequestMapping(path = "/{orderId}/{mealId}/{resultId}",method = RequestMethod.DELETE)
    public String deleteItem(@PathVariable("orderId")int orderId,@PathVariable("mealId")int mealId,@PathVariable("resultId")int resultId){
        // 目标：使用body参数来获取请求体中的内容，从请求体中获取参数，封装到User实体类对象中
        System.out.println("根据id进行删除：orderId:"+orderId+",mealId:"+mealId+",resultId:"+resultId);
        return "success";
    }

    // 获取请求头信息
    @RequestMapping("/getAccept")
    public String getAccept(@RequestHeader(value = "Accept") String accept){
        System.out.println("请求头accept的信息："+accept);
        return "success";
    }

    // 获取名字叫做 JSESSIONID的cookie值
    @RequestMapping("/getCookieValue")
    public String getCookieValue(@CookieValue(value = "JSESSIONID") String cookieValue){
        System.out.println("获取的cookie的值为："+cookieValue);
        return "success";
    }

    // 更新用户
    @RequestMapping("/updateUser")
    public String updateUser(User user){
        System.out.println("更新的用户数据是："+user);
        return "success";
    }

    // 先控制器方法之前执行该方法
/*    @ModelAttribute
    public User getUserById(int id){
        System.out.println("根据id来查询用户信息："+id);
        User user = new User();
        user.setBirthday(new Date());
        return user;
    }*/

    // 让session域对象msg存入一个值
    @RequestMapping("/msg")
    public String msg(Model model){
        // model表示的数据模型，其实也就是往域对象中存放数据
        model.addAttribute("msg","我是域对象中msg的值");
        return "success";
    }

}
