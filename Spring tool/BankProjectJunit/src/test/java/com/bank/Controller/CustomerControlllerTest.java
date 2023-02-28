package com.bank.Controller;


import com.bank.Entity.Accounts;
import com.bank.Entity.Customer;
import com.bank.service.CustomerService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@WebMvcTest(CustomerController.class)
@ExtendWith(MockitoExtension.class)
@TestMethodOrder(OrderAnnotation.class)

class CustomerControllerTest {
   
   

   @Autowired
    private MockMvc mockMvc;
   
   @MockBean
   CustomerService customerService;
   
   Accounts accounts;
   
    @Autowired
    private ObjectMapper objectMapper;
    
   @Order(1)
    @Test
    public void hello() throws Exception {
        
        RequestBuilder request=MockMvcRequestBuilders.get("/helloo").accept(MediaType.APPLICATION_JSON);
        MvcResult mvcresult=mockMvc.perform(request).andReturn();
        
       assertEquals("Hello welcome to customer Controller",mvcresult.getResponse().getContentAsString());
            
   
    }
   @Order(2)
   @SuppressWarnings("unchecked")
   @Test
   void CreateCustomerAccount()throws Exception {
      Customer customer=new Customer();
      customer.setCustomerId(123);
      customer.setCustomerName("Naresh");
      customer.setAge(25);
      customer.setEmail("naresh@gmail.com");
      customer.setAccounts(null);
      customer.setAccounts((List<Accounts>)accounts);
      Accounts accounts=new Accounts();
      accounts.setAccountId(1234);
      accounts.setAccountNumber(10001l);
      accounts.setAccountType("current");
      accounts.setBalance(50000.00);
      accounts.setBranch("CNR");
      
      
      when(customerService.CreateCustomer(customer)).thenReturn(customer);
      
          ResultActions response= mockMvc.perform(post("/customer")
                           .contentType(MediaType.APPLICATION_JSON)
                     .content(new ObjectMapper().writeValueAsString(customer)));
             

      response.andDo(print())     //to print output
          .andExpect(status().isOk());
         
  
//   .andExpect(jsonPath("$.customerId", is(123)))
//    .andExpect(jsonPath("$.customerName", is(customer.getCustomerName())))
//    .andExpect(jsonPath("$.age", is(customer.getAge())))
//    .andExpect(jsonPath("$.email", is(customer.getEmail())))
//    .andExpect(jsonPath("$.accounts", is(customer.getAccounts())));
    }
   @Order(3)
   @Test
   void GetBYId() throws Exception {
      Customer customer=new Customer();
      customer.setCustomerId(123);
      customer.setCustomerName("Naresh");
      customer.setAge(25);
      customer.setEmail("naresh@gmail.com");
      customer.setAccounts(null);
//    customer.setAccounts((List<Accounts>)accounts);
//    Accounts accounts=new Accounts();
//    accounts.setAccountId(1234);
//    accounts.setAccountNumber(10001l);
//    accounts.setAccountType("current");
//    accounts.setBalance(50000.00);
//    accounts.setBranch("CNR");
         

when(customerService.getCustomersDetialsId(customer.getCustomerId()))
             .thenReturn(customer);
      
       ResultActions response= mockMvc.perform(get("/customer/{customerId}",customer.getCustomerId())
                        .contentType(MediaType.APPLICATION_JSON)
                  .content(new ObjectMapper().writeValueAsString(customer)));
          

      response.andDo(print())    //to print output
              .andExpect(status().isOk())
    .andExpect(jsonPath("$.customerId").value(123));

   }
   @Order(4)
   @Test
   void GetAllAccounts() throws Exception {
      Customer customer=new Customer();
      customer.setCustomerId(123);
      customer.setCustomerName("Naresh");
      customer.setAge(25);
      customer.setEmail("naresh@gmail.com");
      customer.setAccounts(null);
//    customer.setAccounts((List<Accounts>)accounts);
//    Accounts accounts=new Accounts();
//    accounts.setAccountId(1234);
//    accounts.setAccountNumber(10001l);
//    accounts.setAccountType("current");
//    accounts.setBalance(50000.00);
//    accounts.setBranch("CNR");
      
      Customer customer1=new Customer();
      customer1.setCustomerId(124);
      customer1.setCustomerName("Mahesh");
      customer1.setAge(25);
      customer1.setEmail("Mahesh@gmail.com");
      customer1.setAccounts(null);
//    customer1.setAccounts((List<Accounts>)accounts);
//    Accounts accounts1=new Accounts();
//    accounts1.setAccountId(1235);
//    accounts1.setAccountNumber(10002l);
//    accounts1.setAccountType("current");
//    accounts1.setBalance(50000.00);
//    accounts1.setBranch("CNR");
      
      List<Customer>list=new ArrayList<>();  
      list.add(customer);
        list.add(customer1);
      
      when(customerService.getAllCustomersDetials()).thenReturn(list);
      
      
       ResultActions response= mockMvc.perform(get("/customer")
                 .contentType(MediaType.APPLICATION_JSON)
           .content(new ObjectMapper().writeValueAsString(list)));
   

      response.andDo(print())     //to print output
              .andExpect(status().isOk());
      //      .andExpect(jsonPath("$[0].customerId").value(124));
            
   }
   @Order(5)
   @Test
   void Delete() throws  Exception {
      
      long customerid=123l;
      Customer customer1=new Customer();
      
      customer1.setCustomerName("Mahesh");
      customer1.setAge(25);
      customer1.setEmail("Mahesh@gmail.com");
      customer1.setAccounts(null);
      
      doNothing().when(customerService).DeleteCustomer(customerid);
      
       ResultActions response= mockMvc.perform(delete("/customer/{customerId}",customerid)
                 .contentType(MediaType.APPLICATION_JSON)
           .content(new ObjectMapper().writeValueAsString(customer1)));
       
       
       response.andDo(print())     //to print output
           .andExpect(status().isOk()); //200
                   
   }
   
}

