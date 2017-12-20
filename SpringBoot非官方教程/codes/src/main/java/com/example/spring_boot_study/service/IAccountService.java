package com.example.spring_boot_study.service;

import com.example.spring_boot_study.model.Account;

import java.util.List;

/**
 * Created by DaiYan on 2017/12/19.
 */
public interface IAccountService {
    List<Account> queryAll();
}
