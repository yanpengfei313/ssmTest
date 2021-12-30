package com.fei.service.impl;

import com.fei.dao.AccountDao;
import com.fei.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import javax.sql.DataSource;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;

    @Autowired
    private DataSource dataSource;

    @Autowired
    private DataSourceTransactionManager dataSourceTransactionManager;

    public void transfer(final String forName, final String toName, final Double money) {

        // 创建一个事务模板
        TransactionTemplate transactionTemplate = new TransactionTemplate();
        // 往事务模板中设置事务管理者
        transactionTemplate.setTransactionManager(dataSourceTransactionManager);
        // 执行事务管理
        transactionTemplate.execute(new TransactionCallback<Object>() {
            public Object doInTransaction(TransactionStatus transactionStatus) {
                // 进行转账操作的相关业务
                // 调用dao层对象进行转出转入账户的操作
                accountDao.updateAccount(forName,-money);
                // 异常
                int num = 1/0;
                accountDao.updateAccount(toName,+money);
                return null;
            }
        });
    }
}
