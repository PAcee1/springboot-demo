package com.enbuys.springboot.controller;

import com.enbuys.springboot.bean.Department;
import com.enbuys.springboot.bean.Employee;
import com.enbuys.springboot.dao.DepartmentDao;
import com.enbuys.springboot.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Pace
 * @Data: 2019/10/29 10:59
 * @Version: v1.0
 */
@RestController
public class DepartmentController {

    @Autowired
    private DepartmentDao departmentDao;

    @Autowired
    private EmployeeDao employeeDao;

    @GetMapping("/dept/{id}")
    public Department getById(@PathVariable("id") Integer id){
        return departmentDao.getById(id);
    }

    @GetMapping("/emp/{id}")
    public Employee getByEmpId(@PathVariable("id") Integer id){
        return employeeDao.getById(id);
    }

    @GetMapping("/dept")
    public Department insert(Department department){
        departmentDao.insert(department);
        return department;
    }

}
