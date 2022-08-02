package com.mayurmishra.department.controller;

import com.mayurmishra.department.entity.Department;
import com.mayurmishra.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Project - department-service
 * Created By MAYUR on 01/08/22
 */
@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartmentService(@RequestBody Department department) {
        log.info(" Request received for saving department : {}", department);
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department getDepartmentById(@PathVariable("id") Long departmentId) {
        log.info(" Request received to get department by Id : {}", departmentId);
        Department department =  departmentService.getDepartmentById(departmentId);
        return new Department(department.getDepartmentId(), department.getDepartmentName(), department.getDepartmentAddress(), department.getDepartmentCode());
    }
}
