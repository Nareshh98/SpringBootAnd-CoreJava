package com.relations.Entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customerId; 
	
	private String customerName;
	
	
	

	@ManyToMany(cascade =CascadeType.ALL)
	@JoinTable(name="Customer_Item",joinColumns = {@JoinColumn(name="customer_id")},
	inverseJoinColumns ={@JoinColumn(name="Item_id")})
	private Set<Item> items=new HashSet<>();
	
	public Customer(String customerName) {
		this.customerName = customerName;
	}

	public Set<Item> getItems() {
		return items;
	}

	public void setItems(Set<Item> items) {
		this.items = items;
	}
}
