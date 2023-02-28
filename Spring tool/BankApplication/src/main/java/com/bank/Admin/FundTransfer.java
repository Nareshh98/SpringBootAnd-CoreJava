package com.bank.Admin;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

//@Entity
@Component
public class FundTransfer {
//	@Id
//	@GeneratedValue
	Integer id;
    AdminTable fromAccount; 

    AdminTable toAccount;  

    double amount;
 
    public AdminTable getFromAccount() {
        return fromAccount;
    }
 
    public void setFromAccount(AdminTable fromAccount) {
        this.fromAccount = fromAccount;
    }
 
    public AdminTable getToAccount() {
        return toAccount;
    }
 
    public void setToAccount(AdminTable toAccount) {
        this.toAccount = toAccount;
    }
 
    public double getAmount() {
        return amount;
    }
 
    public void setAmount(double amount) {
        this.amount = amount;
    }

}


