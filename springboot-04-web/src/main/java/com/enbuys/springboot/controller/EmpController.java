package com.enbuys.springboot.controller;

import com.enbuys.springboot.dao.EmployeeDao;
import com.enbuys.springboot.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;

/**
 * @Author: Pace
 * @Data: 2019/10/25 16:58
 * @Version: v1.0
 */
@Controller
public class EmpController {

    @Autowired
    private EmployeeDao employeeDao;

    @GetMapping("/emp")
    public String list(Model model){
        Collection<Employee> all = employeeDao.getAll();
        model.addAttribute("emps",all);
        return "list";
    }
}
