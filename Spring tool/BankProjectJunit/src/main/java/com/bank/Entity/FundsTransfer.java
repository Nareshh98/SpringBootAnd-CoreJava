package com.bank.Entity;

import org.springframework.stereotype.Component;

@Component
public class FundsTransfer {
   
   Accounts fromAccount;
   Accounts toAccount;
   double amount;
   

   public Accounts getFromAccount() {
      return fromAccount;
   }
   public void setFromAccount(Accounts fromAccount) {
      this.fromAccount = fromAccount;
   }
   public Accounts getToAccount() {
      return toAccount;
   }
   public void setToAccount(Accounts toAccount) {
      this.toAccount = toAccount;
   }
   public double getAmount() {
      return amount;
   }
   public void setAmount(double amount) {
      this.amount = amount;
   }
   
   

}
