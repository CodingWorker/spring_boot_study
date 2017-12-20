package com.example.spring_boot_study.controller;

import com.example.spring_boot_study.model.Teacher;
import com.example.spring_boot_study.service.ITeacherService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by DaiYan on 2017/12/20.
 */
@RestController
@RequestMapping("/teacher")
public class TeacherController {
    @Autowired
    private ITeacherService teacherService;

    @RequestMapping("/all")
    public String queryAll()throws Exception{
        List<Teacher> list=teacherService.queryAll();
        ObjectMapper om=new ObjectMapper();
        return om.writeValueAsString(list);
    }
}
