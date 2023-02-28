package com.bank.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bank.Entity.Customer;
import com.bank.exceptions.ResourceNotFoundException;
import com.bank.service.CustomerService;



@RestController
public class CustomerController {
   
   @Autowired
   CustomerService customerService;
   
   
   @GetMapping("/helloo")
   public String Hello() {
      return "Hello welcome to customer Controller";
   }
   
   @PostMapping("/customer")
   public Customer CreateCustomer(@RequestBody Customer customer) throws ResourceNotFoundException {
      return customerService.CreateCustomer(customer);   
   }

   @GetMapping("/customer")
   public List<Customer> getAllCustomers(){
      return customerService.getAllCustomersDetials();      
   }
   
   @GetMapping("/customer/{customerId}")
   public Customer getCustomer(@PathVariable("customerId") Long customerId) {
      return     customerService.getCustomersDetialsId(customerId);
   }
   
   @PutMapping("/customer/update/{id}")
   public Customer UpdateCustomer(@PathVariable("id")Integer customerId,@RequestBody Customer customer ) {
      return customerService.UpdateCustomer(customer);
            
   }

   @DeleteMapping("/customer/{customerId}")
   public void DeleteCustomer(@PathVariable("customerId") Long customerId) {
      
      customerService.DeleteCustomer(customerId);
   }
}

