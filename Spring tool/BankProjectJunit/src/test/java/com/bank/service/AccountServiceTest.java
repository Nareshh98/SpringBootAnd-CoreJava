package com.bank.service;

import java.util.List;
import java.util.Optional;


import org.assertj.core.api.Assertions;
import org.assertj.core.api.BDDAssumptions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import org.mockito.junit.jupiter.MockitoExtension;

import com.bank.Entity.Accounts;
import com.bank.Repository.AccountRepository;
import com.bank.exceptions.ResourceNotFoundException;

import static org.assertj.core.api.BDDAssumptions.*;
import static org.mockito.BDDMockito.willDoNothing;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class AccountServiceTest {
   
   @Mock
   AccountRepository accountRepository;
      
   @InjectMocks
   AccountService accountService;
   
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
   
   @Test
   void CreatAccount() throws ResourceNotFoundException  {
    given(accountRepository.findByAccountNumber(accounts.getAccountNumber()))
         .willReturn(Optional.empty());
      
      given(accountRepository.save(accounts))
                .willReturn(accounts);
        Accounts account=accountService.Createaccount(accounts);      
        Assertions.assertThat(account).isNotNull();    
   }
   
   @Test
   void DisplayAllemployess() {
      
      Accounts accounts1=new Accounts();
      accounts1.setAccountId(1235l);
      accounts1.setAccountNumber(10001l);
      accounts1.setAccountType("current");
      accounts1.setBalance(50000.00);
      accounts1.setBranch("CNR");
      
      //given(accountRepository.findAll()).willReturn(List.of(accounts,accounts1));
            //(List.of(accounts,accounts1));
      given(accountRepository.findAll()).willReturn(List.of(accounts,accounts1));

      
        List<Accounts> account=accountService.getAllaccounts();
        Assertions.assertThat(account).isNotNull();
        Assertions.assertThat(account.size()).isEqualTo(2);
   }
// @Test
// void getByaccountid() {
//    given(accountRepository.findById(1235)).willReturn(Optional.of(accounts));
//        
//    Optional<Accounts> accounts= accountService.getByAccountId(accounts.getAccountId());
//
//       
//        Assertions.assertThat(accounts).isNotNull(); 
// }
// 
   @Test
   void updateAccount() {
      given(accountRepository.save(accounts)).willReturn(accounts);
      
      
      accounts.setAccountNumber(1236l);
      accounts.setAccountType("saving");
      accounts.setBalance(5000.00);
      accounts.setBranch("CMR");
      Accounts account=accountService.UpdateAccount(accounts);
      
      
      Assertions.assertThat(accounts.getAccountNumber()).isEqualTo(1236l);
      Assertions.assertThat(accounts.getAccountType()).isEqualTo("saving");
      Assertions.assertThat(accounts.getBalance()).isEqualTo(5000.00);
      Assertions.assertThat(accounts.getBranch()).isEqualTo("CMR");
   
   } 
   @Test
   void DeleteById(){
      willDoNothing().given(accountRepository).deleteById(1234l);
       
      accountService.DeleteAccount(1234l);
        
        verify(accountRepository,times(1)).deleteById(1234l);
      
   }

   


}
