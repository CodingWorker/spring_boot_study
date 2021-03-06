package com.example.spring_boot_study.controller;

import com.example.spring_boot_study.model.Account;
import com.example.spring_boot_study.service.IAccountService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by DaiYan on 2017/12/19.
 */
@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private IAccountService accountService;

    @RequestMapping("/all")
    public String queryAll()throws Exception{
        List<Account> list=accountService.queryAll();
        ObjectMapper om=new ObjectMapper();
        return om.writeValueAsString(list);
    }
}
