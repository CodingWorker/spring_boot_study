package com.example.spring_boot_study.model;

/**
 * Created by DaiYan on 2017/12/19.
 */
public class Account {
    /**
     * id
     */
    private Integer id;

    /**
     * name
     */
    private String name;

    /**
     * money
     */
    private String money;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }
}
