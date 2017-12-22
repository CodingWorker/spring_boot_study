package com.example.spring_boot_study.controller;

import org.hibernate.engine.config.spi.ConfigurationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by DaiYan on 2017/12/21.
 */
    @SpringBootApplication
    @Import(ConfigurationService.class)
    @RestController
    public class DemoController {

    private final Service service;

    @Autowired
    public DemoController(Service service) {
        this.service = service;
    }

    @GetMapping("/")
    public String home() {
        return service.value();
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoController.class, args);
    }
}
