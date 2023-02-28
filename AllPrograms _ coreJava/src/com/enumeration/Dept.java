package com.enumeration;

public enum Dept {
	
	CS("jhon","block A"),IT("Naresh","block B"),CIVIL("Raj","block c"),EEE("Akhil","block D"),ECE("Arjun","block E");
	
	String head;
	String location;
	
	
	private Dept(String head, String location) {
		this.head = head;
		this.location = location;
	}


	public String getHeadName() {
		return head;	
	}
	public String getLocation() {
		return location;	
	}

}
