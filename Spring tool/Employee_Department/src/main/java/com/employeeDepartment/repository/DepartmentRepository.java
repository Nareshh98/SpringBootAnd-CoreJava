package com.employeeDepartment.repository;
import org.springframework.data.repository.CrudRepository;

import com.employeeDepartment.entity.Department;


 
public interface DepartmentRepository extends CrudRepository<Department, Integer> {
 
}
