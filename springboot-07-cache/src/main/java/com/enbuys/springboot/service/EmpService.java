package com.enbuys.springboot.service;

import com.enbuys.springboot.dao.EmployeeDao;
import com.enbuys.springboot.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.cache.annotation.*;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.stereotype.Service;

/**
 * @Author: Pace
 * @Data: 2019/10/31 14:13
 * @Version: v1.0
 */
@CacheConfig(cacheNames = "emp")
@Service
public class EmpService {

    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private RedisCacheManager redisCacheManager;

    @Cacheable(/*cacheNames = "emp"*/)
    public Employee getById(Integer id){
        return employeeDao.getById(id);
    }

    @CachePut(/*cacheNames = "emp",*/key = "#employee.id")
    public Employee update(Employee employee){
        employeeDao.update(employee);
        return employee;
    }

    @CacheEvict(/*cacheNames = "emp"*/)
    public void deleteById(Integer id){
        System.out.println("delete emp id="+id);
        //employeeDao.delete(id);
    }

    /*@Caching(
            cacheable = {
                    @Cacheable(*//*cacheNames = "emp",*//*key = "#lastName")
            }*//*,
            put = {
                    @CachePut(*//**//*cacheNames = "emp",*//**//*key = "#result.id")
            }*//*
    )*/
    public Employee getBylastName(String lastName){
        Employee employee = employeeDao.getBylastName(lastName);
        Cache cache = redisCacheManager.getCache("emp");
        cache.put("emp:test",employee);
        return employee;
    }
}
