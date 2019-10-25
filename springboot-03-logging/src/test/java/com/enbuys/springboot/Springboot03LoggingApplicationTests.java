package com.enbuys.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.swing.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot03LoggingApplicationTests {

    // SLF4j的日志工厂，获取日志对象
    Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    public void contextLoads() {
        // 日志级别由低到高，trace《debug《info《warn《error
        // 如果使用Springboot默认的日志级别root，只会打印info以上的日志
        logger.trace("这是trace日志。。。");
        logger.debug("这是debug日志。。。");
        logger.info("这是info日志。。。");
        logger.warn("这是warn日志。。。");
        logger.error("这是error日志。。。");
    }

}
