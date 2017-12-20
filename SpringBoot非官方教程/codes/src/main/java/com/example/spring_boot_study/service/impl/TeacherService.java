package com.example.spring_boot_study.service.impl;

import com.example.spring_boot_study.dao.ITeacherDAO;
import com.example.spring_boot_study.model.Teacher;
import com.example.spring_boot_study.service.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by DaiYan on 2017/12/20.
 */
@Service
public class TeacherService implements ITeacherService {
    @Autowired
    private ITeacherDAO teacherDAO;

    public List<Teacher> queryAll(){
        return teacherDAO.queryAll();
    }
}
