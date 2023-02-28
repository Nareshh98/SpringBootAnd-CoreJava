package com.bank.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Accounts {
   
   @Id
   @GeneratedValue
   private long accountId;
   
   private long accountNumber;
   private String accountType;
   private String branch;
   private double balance;
   
   public Accounts() {
      super();
      
   }

   public Accounts(long accountId, long accountNumber, String accountType, String branch, double balance) {
      super();
      this.accountId = accountId;
      this.accountNumber = accountNumber;
      this.accountType = accountType;
      this.branch = branch;
      this.balance = balance;
   }

   public long getAccountId() {
      return accountId;
   }

   public void setAccountId(long accountId) {
      this.accountId = accountId;
   }

   public long getAccountNumber() {
      return accountNumber;
   }

   public void setAccountNumber(long accountNumber) {
      this.accountNumber = accountNumber;
   }

   public String getAccountType() {
      return accountType;
   }

   public void setAccountType(String accountType) {
      this.accountType = accountType;
   }

   public String getBranch() {
      return branch;
   }

   public void setBranch(String branch) {
      this.branch = branch;
   }

   public double getBalance() {
      return balance;
   }

   public void setBalance(double balance) {
      this.balance = balance;
   }
   
     
   
}
 

