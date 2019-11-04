package com.enbuys.task.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @Author: Pace
 * @Data: 2019/11/4 19:13
 * @Version: v1.0
 */
@Service
public class TaskService {

    @Async
    public void hello(){
        try {
            Thread.sleep(3000);
            System.out.println("我睡了三秒");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Scheduled(cron = "0 * * * * 0-7")
    public void scheduled(){
        System.out.println("定时任务执行");
    }
}
