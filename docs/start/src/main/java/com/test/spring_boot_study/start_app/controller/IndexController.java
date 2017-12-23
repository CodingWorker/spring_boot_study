package com.test.spring_boot_study.start_app.controller;

/**
 * @Desription
 * @Author Dai
 * @Date 2017/12/24
 */
@RestController
public class IndexController {
    @RequestMapping
    public String Index(){
        return "hello world!";
    }
}
