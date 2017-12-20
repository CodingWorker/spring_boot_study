package com.example.spring_boot_study.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by DaiYan on 2017/12/20.
 */
@Entity
public class Student {
    /**
     * id
     */
    @Id
    @GeneratedValue
    private Integer id;

    /**
     * name
     */
    private String name;

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
}
