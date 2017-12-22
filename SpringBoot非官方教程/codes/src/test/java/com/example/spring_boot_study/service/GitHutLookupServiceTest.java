package com.example.spring_boot_study.service;

import com.example.spring_boot_study.model.User;
import com.example.spring_boot_study.service.impl.GitHubLookupService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.concurrent.Future;

/**
 * Created by DaiYan on 2017/12/21.
 */
@Component
public class GitHutLookupServiceTest implements CommandLineRunner{

    private GitHubLookupService gitHubLookupService;

    public GitHutLookupServiceTest(GitHubLookupService gitHubLookupService){
        this.gitHubLookupService=gitHubLookupService;
    }

    @Override
    public void run(String... strings) throws Exception {
        Future<User> user1=this.gitHubLookupService.findUser("PivotalSoftware");
        Future<User> user2=this.gitHubLookupService.findUser("CloudFoundry");
        Future<User> user3=this.gitHubLookupService.findUser("Spring-projects");

        while(!user1.isDone() || !user2.isDone() || !user3.isDone()){
            Thread.sleep(10);
        }

        System.out.println(user1.toString());
        System.out.println(user2.toString());
        System.out.println(user3.toString());

    }
}
