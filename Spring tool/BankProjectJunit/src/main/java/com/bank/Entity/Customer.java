package com.bank.Entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;



@Entity
public class Customer {
   
   @Id
   private long customerId;
   private String customerName;
   private int age;
   private String email;
   
   
   @OneToMany(targetEntity=Accounts.class,cascade=CascadeType.ALL)
   @JoinColumn(name="custId_fk",referencedColumnName="customerId")
   
   List<Accounts> accounts;
   
   
   
   public Customer() {
      super();
      
   }

   
   public Customer( long customerId, String customerName, int age, String email) {
      super();
      this.customerId = customerId;
      this.customerName = customerName;
      this.age = age;
      this.email = email;
      
   }


   


   public long getCustomerId() {
      return customerId;
   }


   public void setCustomerId(long customerId) {
      this.customerId = customerId;
   }


   public String getCustomerName() {
      return customerName;
   }


   public void setCustomerName(String customerName) {
      this.customerName = customerName;
   }


   public int getAge() {
      return age;
   }


   public void setAge(int age) {
      this.age = age;
   }


   public String getEmail() {
      return email;
   }


   public void setEmail(String email) {
      this.email = email;
   }


   public List<Accounts> getAccounts() {
      return accounts;
   }


   public void setAccounts(List<Accounts> accounts) {
      this.accounts = accounts;
   }
 

}
