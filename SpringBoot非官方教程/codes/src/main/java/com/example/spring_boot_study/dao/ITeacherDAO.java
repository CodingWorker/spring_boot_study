package com.example.spring_boot_study.dao;

import com.example.spring_boot_study.model.Teacher;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by DaiYan on 2017/12/20.
 */
@Mapper
public interface ITeacherDAO {

    @Select("SELECT * FROM teacher")
    List<Teacher> queryAll();
}
