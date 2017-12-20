package com.example.spring_boot_study.service;

import com.example.spring_boot_study.model.Teacher;

import java.util.List;

/**
 * Created by DaiYan on 2017/12/20.
 */
public interface ITeacherService {
    List<Teacher> queryAll();
}
