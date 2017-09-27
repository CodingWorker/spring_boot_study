package com.test.spring_boot.demos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by IntelliJ IDEA
 * User:    DaiYan
 * Date:    2017/9/27
 * Project: Demo
 */
@SpringBootApplication//same as Configuration / EnableAutoConfiguration
@ComponentScan
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
