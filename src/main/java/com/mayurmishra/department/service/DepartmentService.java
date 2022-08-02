package com.mayurmishra.department.service;

import com.mayurmishra.department.entity.Department;
import com.mayurmishra.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Project - department-service
 * Created By MAYUR on 01/08/22
 */
@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;


    public Department saveDepartment(Department department) {
        log.info(" Saving department in repository");
        return departmentRepository.save(department);
    }

    public Department getDepartmentById(Long departmentId) {
        log.info("Getting department from repository");
        Department department =  departmentRepository.getReferenceById(departmentId);
        return department;
    }
}
