package com.enbuys.springboot.controller;

import com.enbuys.springboot.bean.User;
import com.enbuys.springboot.repository.UserRepository;
import com.enbuys.starter.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * @Author: Pace
 * @Data: 2019/10/29 14:53
 * @Version: v1.0
 */
@RestController
public class JpaController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable("id") Integer id){
        Optional<User> user =  userRepository.findById(id);
        return user.orElseGet(User::new);
    }
}
