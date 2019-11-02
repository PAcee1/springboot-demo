package com.enbuys.springboot.controller;

import com.enbuys.springboot.dao.EmployeeDao;
import com.enbuys.springboot.entity.Employee;
import com.enbuys.springboot.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Pace
 * @Data: 2019/10/31 14:09
 * @Version: v1.0
 */
@RestController
public class EmpController {

    @Autowired
    private EmpService empService;

    @GetMapping("emp/{id}")
    public Employee getById(@PathVariable("id") Integer id){
        return empService.getById(id);
    }

    @GetMapping("emp")
    public Employee getById(Employee employee){
        return empService.update(employee);
    }

    @GetMapping("delEmp/{id}")
    public String deleteById(@PathVariable("id")Integer id){
        empService.deleteById(id);
        return "success";
    }

    @GetMapping("emp/lastName/{name}")
    public Employee getByLastName(@PathVariable("name") String name){
        return empService.getBylastName(name);
    }
}
