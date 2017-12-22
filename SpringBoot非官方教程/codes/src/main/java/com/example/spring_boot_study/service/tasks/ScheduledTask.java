package com.example.spring_boot_study.service.tasks;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by DaiYan on 2017/12/21.
 */
@Component
public class ScheduledTask {
    private static final SimpleDateFormat sdf=new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)//5000毫秒执行任务
    public void reportCurrentTime(){
        System.out.println("Now: "+sdf.format(new Date()));
    }
}
