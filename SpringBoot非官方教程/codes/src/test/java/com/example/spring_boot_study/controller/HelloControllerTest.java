package com.example.spring_boot_study.controller;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import javax.swing.*;
import java.io.IOException;
import java.net.URL;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by DaiYan on 2017/12/19.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HelloControllerTest {
    private Integer port;

    private URL base;

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Before
    private void setUp()throws IOException{
        this.base=new URL("http://localhost:"+port+"/");
    }

    @Test
    private void getHello()throws IOException{
        ResponseEntity<Spring> rsp=this.testRestTemplate
                .getForEntity(this.base.toString(),Spring.class);
        assertThat(rsp.getBody(), equalTo("Greetings from Spring Boot!"));
    }

}
