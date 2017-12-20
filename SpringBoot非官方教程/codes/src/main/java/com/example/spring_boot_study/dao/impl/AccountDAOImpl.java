package com.example.spring_boot_study.dao.impl;

import com.example.spring_boot_study.dao.IAccountDAO;
import com.example.spring_boot_study.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by DaiYan on 2017/12/19.
 */
@Repository
public class AccountDAOImpl implements IAccountDAO{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * get all accounts
     * @return
     */
    public List<Account> queryAll(){
        String sql="SELECT * FROM account;";
        List<Account> list=jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(Account.class));
        return list;
    }
}
