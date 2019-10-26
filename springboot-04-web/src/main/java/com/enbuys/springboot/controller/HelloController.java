package com.enbuys.springboot.controller;

import com.enbuys.springboot.exception.UserNotExistException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @Author: Pace
 * @Data: 2019/10/23 19:56
 * @Version: v1.0
 */
@Controller
public class HelloController {

    @RequestMapping("success")
    public String success(Map<String,Object> map){
        map.put("hello","你好，Thymeleaf");
        return "success";
    }

    @RequestMapping("hello")
    public String hello(Map<String,Object> map){
        throw new UserNotExistException();
    }
}
