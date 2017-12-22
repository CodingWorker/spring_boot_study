package com.example.spring_boot_study;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by DaiYan on 2017/12/21.
 */
@ConfigurationProperties("service")
public class ServicesProperties {
    private String message;

    public String getMessage(){
        return this.message;
    }

    public void setMessage(){
        this.message=message;
    }


}
