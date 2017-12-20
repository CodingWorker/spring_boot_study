package com.example.spring_boot_study.service.impl;

import com.example.spring_boot_study.dao.IStudentDAO;
import com.example.spring_boot_study.model.Student;
import com.example.spring_boot_study.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by DaiYan on 2017/12/20.
 */
@Service
public class StudentServiceImpl implements IStudentService {
    @Autowired
    private IStudentDAO studentDAO;

    public List<Student> queryAll(){
        return studentDAO.findAll();
    }
}
