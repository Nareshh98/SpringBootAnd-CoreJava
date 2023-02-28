package com.relations.Entity;

import jakarta.persistence.*;

@Entity
public class Item {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int iteamId;
	private String iteamName;


	
	public Item(String iteamName) {
		this.iteamName = iteamName;
	}
	

}
