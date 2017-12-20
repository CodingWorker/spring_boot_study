package com.example.spring_boot_study.controller;

import com.example.spring_boot_study.service.IStudentService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by DaiYan on 2017/12/20.
 */
@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private IStudentService studentService;

    @RequestMapping("/all")
    public String queryAll()throws Exception{
        ObjectMapper om=new ObjectMapper();
        return  om.writeValueAsString(studentService.queryAll());
    }
}
