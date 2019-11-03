package com.enbuys.es.controller;

import com.enbuys.es.bean.User;
import com.enbuys.es.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("usr/{name}")
    public List<User> findUserByName(@PathVariable("name") String name){
        List<User> users = userRepository.getUserByName("test");
        return users;
    }
}
