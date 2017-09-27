package com.test.spring_boot.demos.web;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA
 * User:    DaiYan
 * Date:    2017/9/26
 * Project: Demo
 */
@RestController
@EnableAutoConfiguration
public class Example {
    @RequestMapping("/")
    String home(){
        return "hello world!";
    }
}
