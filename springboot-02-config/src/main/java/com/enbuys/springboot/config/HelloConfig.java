package com.enbuys.springboot.config;

import com.enbuys.springboot.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Pace
 * @Data: 2019/10/22 15:25
 * @Version: v1.0
 */
@Configuration
public class HelloConfig {

    @Bean
    public HelloService helloService(){
        System.out.println("helloservice已经通过@Bean添加到容器中");
        return new HelloService();
    }
}
