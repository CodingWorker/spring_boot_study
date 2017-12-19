package com.example.spring_boot_study.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by DaiYan on 2017/12/19.
 */
@RestController
public class HelloController {
    @RequestMapping("/")
    public String sayHi(){
        return "greeting from spring-boot";
    }
}
