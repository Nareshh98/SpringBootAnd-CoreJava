package com.bank.Repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.bank.Entity.Customer;


@DataJpaTest
class CustomerRepositoryTest {
   
   @SuppressWarnings("unused")
   @Autowired
   private CustomerRepository customerRepository;

   private Customer customer;
   
   @BeforeEach
   void test() {
      
      customer=new Customer();
      customer.setCustomerId(1234);
      customer.setCustomerName("naresh");
      customer.setEmail("nareshmail.com");
      customer.setAccounts(null);
            
   }
   @Test
   void saveCustomer() {
      Customer custome=customerRepository.save(customer);
      
      assertThat(custome).isNotNull();
      
   }
   @Test
   void GetAllcustomer() {
      
      Customer customer1=new Customer();
      customer1.setCustomerId(1234);
      customer1.setCustomerName("naresh");
      customer1.setEmail("nareshmail.com");
      customer1.setAccounts(null);
      
      Customer custome=customerRepository.save(customer);
      Customer custome1=customerRepository.save(customer1);
      
      List<Customer> list=new ArrayList<>();
      list.add(custome);
      list.add(custome1);
      
      assertThat(list).isNotNull();
      assertThat(list.size()).isEqualTo(2);
   }
   
   @Test
   void findBycustomerId() {
      customerRepository.save(customer);
      
      Customer custome =customerRepository.findByCustomerId(customer.getCustomerId()).get();
      
      assertThat(custome).isNotNull();
   }
   @Test
   void DeleteById() {
      customerRepository.save(customer);
      customerRepository.delete(customer);
      
      Optional<Customer> cust =customerRepository.findByCustomerId(customer.getCustomerId());
      
      assertThat(cust).isEmpty();
   }
   @Test
   void UpdateByCustomerId() {
      customerRepository.save(customer);
      
      Customer custome =customerRepository.findByCustomerId(customer.getCustomerId()).get();
      
      custome.setCustomerName("challa");
      custome.setAge(25);
      custome.setEmail("challa@gmail.com");
      
      Customer custome1=customerRepository.save(custome);

      assertThat(custome1.getCustomerName()).isEqualTo("challa");
      assertThat(custome1.getAge()).isEqualTo(25);
      assertThat(custome1.getEmail()).isEqualTo("challa@gmail.com");
      
   }
   

}
 
