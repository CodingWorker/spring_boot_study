package com.example.spring_boot_study.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by DaiYan on 2017/12/19.
 */
@Configuration
@PropertySource("classpath:application2.yml")
@ConfigurationProperties(prefix = "bean")
public class ConfigYMLBean {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
