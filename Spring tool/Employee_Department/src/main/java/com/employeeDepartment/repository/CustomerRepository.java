package com.employeeDepartment.repository;

import org.springframework.data.repository.CrudRepository;

import com.employeeDepartment.entity.Customer;


 
public interface CustomerRepository extends CrudRepository<Customer, Integer> {
 
}

