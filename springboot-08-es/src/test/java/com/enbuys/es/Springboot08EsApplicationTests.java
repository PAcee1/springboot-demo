package com.enbuys.es;

import com.enbuys.es.bean.User;
import com.enbuys.es.repository.UserRepository;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Springboot08EsApplicationTests {

    @Autowired
    private UserRepository userRepository;
    @Test
    void contextLoads() {
        List<User> users = userRepository.getUserByName("test");
        System.out.println(users.get(0));
    }

}
