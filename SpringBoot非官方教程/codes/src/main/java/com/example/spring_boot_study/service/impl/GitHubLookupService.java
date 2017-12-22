package com.example.spring_boot_study.service.impl;

import com.example.spring_boot_study.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.Future;

/**
 * Created by DaiYan on 2017/12/21.
 */
@Service
public class GitHubLookupService {

    @Autowired
    private final RestTemplate restTemplate;

    public GitHubLookupService(RestTemplate restTemplate){
        this.restTemplate=restTemplate;
    }

    @Async
    public Future<User> findUser(String user)throws InterruptedException{
        String url=String.format("https://api.github.com/users/%s",user);

        User results=restTemplate.getForObject(url,User.class);

        Thread.sleep(1000L);

        return new AsyncResult<>(results);
    }

}
