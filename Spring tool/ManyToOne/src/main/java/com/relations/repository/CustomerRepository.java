package com.relations.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.relations.Entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
