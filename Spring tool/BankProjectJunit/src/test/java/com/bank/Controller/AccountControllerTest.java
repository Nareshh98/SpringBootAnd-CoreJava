package com.bank.Controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bank.service.AccountService;
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
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.assertEquals;


@WebMvcTest(AccountController.class)
@ExtendWith(MockitoExtension.class)
@TestMethodOrder(OrderAnnotation.class)
class AccountControllerTest {
   @Autowired
    private MockMvc mockMvc;
 
 @MockBean
 AccountService accountService;
 
 @Autowired
    private ObjectMapper objectMapper;
    

   @Test
   void hello() {
      
   }
   @Order(1)
    @Test
       public void helloTest() throws Exception  {
           
           RequestBuilder request=MockMvcRequestBuilders.get("/hello").accept(MediaType.APPLICATION_JSON);
           MvcResult mvcresult=mockMvc.perform(request).andReturn();
           
          assertEquals("Hello AccountController",mvcresult.getResponse().getContentAsString());
               
       }
   
   
}
 
 
