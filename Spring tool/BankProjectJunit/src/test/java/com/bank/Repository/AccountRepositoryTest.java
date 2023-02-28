package com.bank.Repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.bank.Entity.Accounts;



@DataJpaTest
@TestMethodOrder(OrderAnnotation.class)
class AccountRepositoryTest {
   
   @Autowired
   AccountRepository accountRepository;
   
   private Accounts accounts;
   
   @BeforeEach
   void Allmethods() {
      accounts=new Accounts();
      accounts.setAccountId(1234l);
      accounts.setAccountNumber(10001l);
      accounts.setAccountType("current");
      accounts.setBalance(50000.00);
      accounts.setBranch("CNR");
   }
   
   @Order(1)
   @Test
   void saveAccount() {
      
      Accounts account=accountRepository.save(accounts);
      assertThat(account).isNotNull();
      assertThat(account.getAccountId()).isGreaterThan(0);
   }
   @Order(2)
   @Test 
   void findAllAccounts() {
      
      
      Accounts accounts1=new Accounts();
      accounts1.setAccountId(1235);
      accounts1.setAccountNumber(10002l);
      accounts1.setAccountType("current");
      accounts1.setBalance(50000.00);
      accounts1.setBranch("CNR");
      
      Accounts account=accountRepository.save(accounts);
      Accounts account1=accountRepository.save(accounts);
      
      List<Accounts> list=new ArrayList<>();
      list.add(account);
      list.add(account1);
      
      assertThat(list).isNotNull();
      assertThat(list.size()).isEqualTo(2);
      
   }
   @Order(3)
   @Test
   void findbyAccountId() {
      
      
     
   Optional<Accounts> Account=accountRepository.findById(1235l);
   
   assertThat(Account).isNotNull();
   }
   
   
   
   
   @Order(4)
   @Test
   void getByAccountNumber() {
         
      accountRepository.save(accounts);
      
    Accounts account=accountRepository.findByAccountNumber(accounts.getAccountNumber()).get();
   
   assertThat(account).isNotNull();    
   
   }
   @Order(5)
   @Test
   void UpdateById() {
       accountRepository.save(accounts);
      
      Accounts account=accountRepository.findByAccountNumber(accounts.getAccountNumber()).get();
      
      account.setAccountType("Savings");
      account.setBalance(3000.00);
      account.setBranch("cnn");
      
      Accounts UpdatedAcc= accountRepository.save(account);
      
   // assertThat(UpdatedAcc.getAccountNumber()).isEqualTo(123l);
      assertThat(UpdatedAcc.getAccountType()).isEqualTo("Savings");
      assertThat(UpdatedAcc.getBalance()).isEqualTo(3000.00);
      assertThat(UpdatedAcc.getBranch()).isEqualTo("cnn");

   }
   @Order(6)
   @Test
   void DeleteById() {
     accountRepository.save(accounts);
     accountRepository.delete(accounts);
      
      Optional<Accounts> Account=accountRepository.findById(accounts.getAccountId());
      
      assertThat(Account).isEmpty();
      }
}

