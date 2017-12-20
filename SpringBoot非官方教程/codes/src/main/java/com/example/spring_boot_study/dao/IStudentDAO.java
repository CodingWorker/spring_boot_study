package com.example.spring_boot_study.dao;

import com.example.spring_boot_study.model.Student;
import org.springframework.boot.autoconfigure.integration.IntegrationAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by DaiYan on 2017/12/20.
 */
public interface IStudentDAO extends JpaRepository<Student,Integer> {
}
