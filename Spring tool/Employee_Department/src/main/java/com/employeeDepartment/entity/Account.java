package com.employeeDepartment.entity;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;


@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int accountNumber;
    private String accountType;
    private double balance;
    @ManyToMany(cascade=CascadeType.ALL)
    private Set<Customer> customers;
 
    public int getAccountNumber() {
        return accountNumber;
    }
 
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
 
    public String getAccountType() {
        return accountType;
    }
 
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
 
    public double getBalance() {
        return balance;
    }
 
    public void setBalance(double balance) {
        this.balance = balance;
    }
 
    
 
    @Override
    public String toString() {
        return "Account [accountNumber=" + accountNumber + ", accountType=" + accountType + ", balance=" + balance
                + "]";
    }
 
}
