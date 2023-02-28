package com.employeeDepartment.repository;

import org.springframework.data.repository.CrudRepository;

import com.employeeDepartment.entity.Person;


 
public interface PersonRepository extends CrudRepository<Person, Integer> {
 
}
