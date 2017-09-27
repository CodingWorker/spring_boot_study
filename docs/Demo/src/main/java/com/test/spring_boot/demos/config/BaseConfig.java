package com.test.spring_boot.demos.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by IntelliJ IDEA
 * User:    DaiYan
 * Date:    2017/9/27
 * Project: Demo
 */
@Configuration
@ImportResource
@EnableAutoConfiguration(exclude = DataSourceAutoConfiguration.class)//禁用指定的自动
public class BaseConfig {
    private String test;

}
