package com.example.spring_boot_study.service.impl;

import com.example.spring_boot_study.dao.IAccountDAO;
import com.example.spring_boot_study.model.Account;
import com.example.spring_boot_study.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by DaiYan on 2017/12/19.
 */
@Service
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private IAccountDAO accountDAO;

    public List<Account> queryAll(){
        return accountDAO.queryAll();
    }
}
