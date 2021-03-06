package com.example.spring_boot_study.cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by DaiYan on 2017/12/20.
 */
@Repository
public class RedisClient {
    @Autowired
    private StringRedisTemplate redisTemplate;

    public String stringGet(String key){
       return redisTemplate.opsForValue().get(key);
    }
}
