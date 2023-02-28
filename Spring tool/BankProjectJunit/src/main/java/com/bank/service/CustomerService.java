package com.bank.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.Entity.Customer;
import com.bank.Repository.CustomerRepository;
import com.bank.exceptions.ResourceNotFoundException;


@Service
public class CustomerService {
   
   @Autowired
   CustomerRepository customerRepository;
   
   
   public Customer CreateCustomer(Customer customer) throws ResourceNotFoundException {   
      
 Optional<Customer> savedCustomer = customerRepository.findByEmail(customer.getEmail());
    
 if(savedCustomer.isPresent()){
        throw new ResourceNotFoundException("customer already exist with given email:" + customer.getEmail());
   }
    return customerRepository.save(customer);
}
      
   
   public List<Customer> getAllCustomersDetials(){
      return customerRepository.findAll();      
   }
   
   public Customer getCustomersDetialsId(Long customerId) {
      return customerRepository.findById(customerId).get();     
   }
   
   public Customer UpdateCustomer(Customer customer) {
      
      customerRepository.save(customer);
      return customer;
      
   }

   public void DeleteCustomer(Long customerId) {
      
      customerRepository.deleteById(customerId);
      
   }


   


   
}
