package com.enbuys.springboot.service;

import com.enbuys.springboot.dao.EmployeeDao;
import com.enbuys.springboot.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @Author: Pace
 * @Data: 2019/10/31 14:13
 * @Version: v1.0
 */
@Service
public class EmpService {

    @Autowired
    private EmployeeDao employeeDao;

    @Cacheable(cacheNames = "emp")
    public Employee getById(Integer id){
        return employeeDao.getById(id);
    }

    @CachePut(cacheNames = "emp",key = "#employee.id")
    public Employee update(Employee employee){
        employeeDao.update(employee);
        return employee;
    }

    @CacheEvict(cacheNames = "emp")
    public void deleteById(Integer id){
        System.out.println("delete emp id="+id);
        //employeeDao.delete(id);
    }
}
