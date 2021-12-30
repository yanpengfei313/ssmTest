package com.fei.controller;

import com.fei.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class AccountController {

    @Autowired
    private AccountService accountService;
    /* 转账方法 */
    public void transfer(String forName,String toName, Double money){
        accountService.transfer(forName,toName,money);
    }
}
