package com.relations.Entity;

import jakarta.persistence.*;

@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customerId; 
	private String customerName;
	
	
	public Customer(String customerName) {
		this.customerName = customerName;
	}


	@OneToOne(cascade =CascadeType.ALL) // by default it will create column name Item_PrimaryKeyname
	@JoinColumn(name="fk_Item_id")
	private Item item;


	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}
	
	
	
	

}
