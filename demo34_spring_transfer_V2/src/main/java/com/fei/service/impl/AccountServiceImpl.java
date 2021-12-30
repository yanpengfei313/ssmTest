package com.fei.service.impl;

import com.fei.dao.AccountDao;
import com.fei.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;

    public void transfer(String forName,String toName,Double money) {
        // 进行转账操作的相关业务
        // 调用dao层对象进行转出转入账户的操作
        accountDao.updateAccount(forName,-money);
        // 异常
        //int num = 1/0;
        accountDao.updateAccount(toName,+money);


    }
}
