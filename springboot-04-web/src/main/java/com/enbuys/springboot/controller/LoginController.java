package com.enbuys.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @Author: Pace
 * @Data: 2019/10/24 17:44
 * @Version: v1.0
 */
@Controller
public class LoginController {

    @PostMapping(value = "/user/login")
    public String login(@RequestParam String username,
                        @RequestParam String password,
                        Map<String,Object> map, HttpSession session){
        if(!StringUtils.isEmpty(username) && password.equals("123456")){
            // 防止表单重复提交，重定向到主页
            session.setAttribute("userName",username);
            return "redirect:/main.html";
        }
        map.put("msg","登录失败");
        return "login";
    }
}
