package com.bank.service;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.stereotype.Service;

import com.bank.Entity.Accounts;
import com.bank.Entity.FundsTransfer;
import com.bank.Repository.AccountRepository;
import com.bank.exceptions.ResourceNotFoundException;

import jakarta.transaction.Transactional;



@Service
public class AccountService {
   
   @Autowired
   AccountRepository accountRepository;

   public Accounts Createaccount(Accounts accounts) throws ResourceNotFoundException  {
         
 Optional<Accounts> savedaccounts = accountRepository.findByAccountNumber(accounts.getAccountNumber());
    
 if(savedaccounts.isPresent()){
        throw new ResourceNotFoundException("Account already exist with given email:" + accounts.getAccountNumber());
   }
    return accountRepository.save(accounts);
   }

   public List<Accounts> getAllaccounts() {
      
      return accountRepository.findAll();
   }

   public Accounts getByAccountId(long accountId) {
      
      return accountRepository.findById(accountId).get();
   }

   public Accounts UpdateAccount(Accounts accounts) {
      
       accountRepository.save(accounts);
       return accounts;
   }

   public void DeleteAccount(long accountId)  {   
      accountRepository.deleteById(accountId);   
             
   }

   @Transactional
   public FundsTransfer transferAmount(FundsTransfer fundsTransfer)throws Exception {
      
      long fromAccountNum = fundsTransfer.getFromAccount().getAccountNumber();      
        long toAccountNum = fundsTransfer.getToAccount().getAccountNumber();
      System.out.println("fromAccount :"+fromAccountNum);
      System.out.println("toAccount :"+toAccountNum);

      double amtToTrasfer = fundsTransfer.getAmount();
      System.out.println("amtToTrasfer :"+amtToTrasfer);
      Optional<Accounts> fromAccounts = accountRepository.findByAccountNumber(fromAccountNum);
      Accounts fromAccount = fromAccounts.get();
      
      Optional<Accounts> toAccounts = accountRepository.findByAccountNumber(toAccountNum);
      Accounts toAccount = toAccounts.get();
   
      if(amtToTrasfer > fromAccount.getBalance()) {        
         throw new Exception("Balance in Account " + fromAccount + " is insufficient");
         
      } else if(amtToTrasfer < 0) {        
         throw new Exception("Amount to be transferred should not be negative");
         
      } else if(fromAccount.getAccountNumber() == toAccount.getAccountNumber()) {       
         throw new Exception("From Account and to Account cannot be same");
      }
      
      fromAccount.setBalance(fromAccount.getBalance() - amtToTrasfer);
      toAccount.setBalance(toAccount.getBalance() + amtToTrasfer);
      
      Accounts updatedFromAccount = accountRepository.save(fromAccount);
      Accounts updatedToAccount = accountRepository.save(toAccount);
      
      
      FundsTransfer updatedValues = new FundsTransfer();
      updatedValues.setFromAccount(updatedFromAccount);
      updatedValues.setToAccount(updatedToAccount);
      updatedValues.setAmount(amtToTrasfer);
      
      return updatedValues;
      
      
   }
   

}
 
