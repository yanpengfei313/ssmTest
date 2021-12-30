package com.fei.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping("/seyHello")
    public String seyHello(){
        System.out.println("HelloController_seyHello");
        return "success";
    }
}
