package com.mayurmishra.department.repository;

import com.mayurmishra.department.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Project - department-service
 * Created By MAYUR on 01/08/22
 */
@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {


}
