package com.fei.service;

import com.fei.controller.AccountController;

public interface AccountService {
    void transfer(String forName, String toName, Double money);
}
