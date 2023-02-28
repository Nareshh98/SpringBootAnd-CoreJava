package com.bank.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.Entity.Customer;



public interface CustomerRepository extends JpaRepository<Customer, Long> {
   
   Optional<Customer> findByCustomerId(long customerId);

   Optional<Customer> findByEmail(String email);
   

}
