package com.enbuys.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.enbuys.springboot.dao")
@SpringBootApplication
public class Springboot05MybatiesApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot05MybatiesApplication.class, args);
    }

}
