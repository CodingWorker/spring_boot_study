package com.example.spring_boot_study.dao;

import com.example.spring_boot_study.model.Account;

import java.util.List;

/**
 * Created by DaiYan on 2017/12/19.
 */
public interface IAccountDAO {
    List<Account> queryAll();
}
