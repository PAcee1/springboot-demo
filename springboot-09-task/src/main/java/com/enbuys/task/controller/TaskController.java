package com.enbuys.task.controller;

import com.enbuys.task.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Pace
 * @Data: 2019/11/4 19:14
 * @Version: v1.0
 */
@RestController
public class TaskController {

    @Autowired
    private TaskService taskService;


    @GetMapping("hello")
    public String hello(){
        taskService.hello();
        System.out.println("执行其他方法");
        return "success";
    }

}
