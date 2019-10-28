package com.enbuys.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @Author: Pace
 * @Data: 2019/10/28 15:27
 * @Version: v1.0
 */
@RestController
public class JDBCController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping("hello")
    public Map hello(){
        return jdbcTemplate.queryForMap("select * from department");
    }
}
