package com.example.spring_boot_study;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

/**
 * Created by DaiYan on 2017/12/21.
 */
@Configuration
@EnableConfigurationProperties(ServicesProperties.class)
public class ServiceConfiguration {

    @Bean
    public Service service(ServicesProperties servicesProperties){
//        return new Service(servicesProperties.getMessage());
        return null;
    }
}
