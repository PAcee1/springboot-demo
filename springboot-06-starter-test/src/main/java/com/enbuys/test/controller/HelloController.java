package com.enbuys.test.controller;

import com.enbuys.starter.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Action;

/**
 * @Author: Pace
 * @Data: 2019/10/30 19:47
 * @Version: v1.0
 */
@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping("hello")
    public String hello(){
        return helloService.hello("myStarterTest");
    }
}
