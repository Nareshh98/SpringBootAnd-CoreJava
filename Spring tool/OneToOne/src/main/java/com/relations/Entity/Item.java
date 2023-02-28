package com.relations.Entity;

import jakarta.persistence.*;

@Entity
public class Item {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int iteamId;
	private String iteamName;

	@OneToOne(cascade = CascadeType.ALL,mappedBy ="item" ) // mappedBy name we should give another class forein key
	private Customer customer;
	
	public Item(String iteamName) {
		this.iteamName = iteamName;
	}
	

}
