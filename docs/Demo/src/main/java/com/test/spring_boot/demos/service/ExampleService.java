package com.test.spring_boot.demos.service;

import com.test.spring_boot.demos.dao.ExampleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created by IntelliJ IDEA
 * User:    DaiYan
 * Date:    2017/9/27
 * Project: Demo
 */
@Service
public class ExampleService {
    @Autowired
    private ExampleDao exampleDao;

}
