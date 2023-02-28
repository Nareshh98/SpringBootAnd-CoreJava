package com.optional;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
	
       Customer customer=new Customer(123,"Naresh",null,"12345");
       
    
      Optional<Object> emptyoptional =Optional.empty();
      System.out.println(emptyoptional);
      
      
      Optional<String> emailoptional2=Optional.ofNullable(customer.getEmail());
      
      System.out.println(emailoptional2.map(String ::toUpperCase).orElseGet(()->"default eail......"));
      System.out.println(emailoptional2.orElseThrow(()->new IllegalArgumentException("email not present")));
	}
}
class Customer {

	private int id;
	private String name;
	private String email;
	private String number;
	
	public Customer(int id, String name, String email, String number) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.number = number;
	}

	public Customer() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
}