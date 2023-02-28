package com.employeejunit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.employeejunit.entity.Employee;
 

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer>{


    //List<Employee> findByEmpband(String name);
   List<Employee> getByEmpband(String band);


   List<Employee> findByEmpnameAndEmpband(String name,String band);
   //List<Employee> findByEmpnameOrEmpband(String name,String band);
List<Employee> findByEmpsalGreaterThan(int sal);   
 
List<Employee> findByEmpsalLessThanEqual(int sal); 


    @Query("select s from Employee s where s.empband = ?1")
    List<Employee> findByEmpband(String name);


    /*@Query(value = "select * from Employee s where s.empname = ?1", nativeQuery = true)
    List<Employee> findEmployeesUsingNativeQuery(String name);*/



}

