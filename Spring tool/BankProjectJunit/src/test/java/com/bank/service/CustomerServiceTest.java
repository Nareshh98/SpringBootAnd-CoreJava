package com.bank.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.willDoNothing;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.List;
import java.util.Optional;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.bank.Entity.Accounts;
import com.bank.Entity.Customer;
import com.bank.Repository.CustomerRepository;
import com.bank.exceptions.ResourceNotFoundException;


@ExtendWith(MockitoExtension.class)
@TestMethodOrder(OrderAnnotation.class)
class CustomerServiceTest {
   
   @Mock
   CustomerRepository customerRepository;
   
   @InjectMocks
   CustomerService customerService;
   

   private Customer customer;
   private    Accounts accounts;
   
   @SuppressWarnings("unchecked")
   @BeforeEach
   void test() {
      
      customer=new Customer();
      customer.setCustomerId(123l);
      customer.setCustomerName("naresh");
      customer.setEmail("naresh@gmail.com");
      customer.setAge(30);
      customer.setAccounts((List<Accounts>) accounts);
      
       accounts=new Accounts();
      accounts.setAccountId(1234);
      accounts.setAccountNumber(10001l);
      accounts.setAccountType("current");
      accounts.setBalance(50000.00);
      accounts.setBranch("CNR");
      
      
      
         
   }
   @Order(1)
   @Test
   
   void CreateCustomer() throws ResourceNotFoundException  {
   
      
       given(customerRepository.findByEmail(customer.getEmail()))
         .willReturn(Optional.empty());
      
      given(customerRepository.save(customer))
        .willReturn(customer);
      
      Customer cust=customerService.CreateCustomer(customer);
      
      Assertions.assertThat(cust).isNotNull();   
      //assertThat(cust.getCustomerId()).isGreaterThan(0);

      
   }
   @Order(2)
   @Test
   void GetAllCustomer() throws Exception{
      Customer customer1=new Customer();
      customer1.setCustomerId(123);
      customer1.setCustomerName("Akhil");
      customer1.setEmail("Akhil@gmail.com");
      customer1.setAge(30);
   
      //customer1.setAccounts((List<Accounts>) accounts);
      
   
      given(customerRepository.findAll()).willReturn(List.of(customer, customer1));
      
       List<Customer> cust=customerService.getAllCustomersDetials();
       assertThat(cust).isNotNull();
       assertThat(cust.size()).isEqualTo(2);     
   }
   @Order(4)
   @Test
   void DeleteById(){
      willDoNothing().given(customerRepository).deleteById(123l);
       
      customerService.DeleteCustomer(123l);
        
        verify(customerRepository,times(1)).deleteById(123l);
      
   }
   
   @Order(3)
   @Test
   void UpdateCustomer() {
      
      given(customerRepository.save(customer)).willReturn(customer);
      
      customer.setCustomerName("Akhil");
      customer.setAge(21);
      customer.setEmail("Akhil@gmail.com");
      customer.setAccounts(null);
      
      Customer cust=customerService.UpdateCustomer(customer);
      
      assertThat(cust).isNotNull();
      assertThat(cust.getCustomerName()).isEqualTo("Akhil");
      assertThat(cust.getAge()).isEqualTo(21);
      assertThat(cust.getEmail()).isEqualTo("Akhil@gmail.com");
   }
}
 
 
