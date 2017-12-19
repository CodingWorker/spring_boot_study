package com.example.spring_boot_study.controller;

import com.example.spring_boot_study.model.ConfigBean;
import com.example.spring_boot_study.model.ConfigYMLBean;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by DaiYan on 2017/12/19.
 */
@RestController
public class PropertiesController {

    @Value("${my.name}")
    private String name;

    @Value("${my.age}")
    private Integer age;

    @RequestMapping("/name_age")
    public String nameAge(){
        return "name:"+this.name+", age:"+this.age;
    }

    @Autowired
    private ConfigBean configBean;

    @RequestMapping("/config_bean")
    public String configBean()throws Exception{
        ObjectMapper om=new ObjectMapper();
        return om.writeValueAsString(configBean);
    }

    @Autowired
    private ConfigYMLBean configYMLBean;

    @RequestMapping("/configyml_bean")
    public String configYMLBean()throws Exception{
        ObjectMapper om=new ObjectMapper();
        return om.writeValueAsString(configYMLBean);
    }
}
