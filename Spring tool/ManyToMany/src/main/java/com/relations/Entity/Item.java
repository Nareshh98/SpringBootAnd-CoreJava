package com.relations.Entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.*;

@Entity
public class Item {
	
	@Id
	@GeneratedValue
	private int iteamId;
	
	private String iteamName;

	@ManyToMany(cascade =CascadeType.ALL,mappedBy = "items")
	private Set<Customer> customer=new HashSet<>();

	public Item(String iteamName) {
		this.iteamName = iteamName;
	}

	public Set<Customer> getCustomer() {
		return customer;
	}

	public void setCustomer(Set<Customer> customer) {
		this.customer = customer;
	}
	
   
}
