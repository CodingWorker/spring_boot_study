package com.example.spring_boot_study.controller.cache;

import com.example.spring_boot_study.cache.RedisClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by DaiYan on 2017/12/20.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisClientTest {
    @Autowired
    private RedisClient redisClient;

    @Test
    public void stringGetTest(){
        String value= redisClient.stringGet("a");
        System.out.println(value);
    }
}
