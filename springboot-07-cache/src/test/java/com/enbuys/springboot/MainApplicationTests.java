package com.enbuys.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.connection.StringRedisConnection;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MainApplicationTests {

    @Autowired
    StringRedisConnection stringRedisConnection;
    @Autowired
    RedisTemplate redisTemplate;

    @Test
    public void test(){
        stringRedisConnection.append("springboot","hello");
    }
}
