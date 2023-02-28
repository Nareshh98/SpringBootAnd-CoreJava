package com.relations.Entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customerId; 
	private String customerName;
	
	
	public Customer(String customerName) {
		this.customerName = customerName;
	}


	@OneToMany(cascade =CascadeType.ALL)
	@JoinColumn(name="customer_id" )
//	@JoinColumn(name="customer_id",referencedColumnName ="customerId" )
	private List<Item> item=new ArrayList<>();

	public List<Item> getItem() {
		return item;
	}

	public void setItem(List<Item> item) {
		this.item = item;
	}
}
