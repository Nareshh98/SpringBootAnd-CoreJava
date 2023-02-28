package com.relations.Entity;

import jakarta.persistence.*;

@Entity
public class Item {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int iteamId;
	
	private String iteamName;

     @ManyToOne(cascade = CascadeType.ALL)
     @JoinColumn(name="customer_id")
     private Customer customer;
     
	
	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	public Item(String iteamName) {
		this.iteamName = iteamName;
	}
	
   // ManytoOne bydirection
}
