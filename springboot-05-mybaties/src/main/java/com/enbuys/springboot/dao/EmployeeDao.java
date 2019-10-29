package com.enbuys.springboot.dao;

import com.enbuys.springboot.bean.Employee;

/**
 * @Author: Pace
 * @Data: 2019/10/29 13:53
 * @Version: v1.0
 */
public interface EmployeeDao {

    public Employee getById(Integer id);

    public int insert(Employee employee);
}
