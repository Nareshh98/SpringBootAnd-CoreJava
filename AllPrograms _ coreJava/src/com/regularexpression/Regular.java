package com.regularexpression;

public class Regular {
	public static void main(String[] args) {
		
		String str="         i am   good    boy        ";
		
		String str1=str.replaceAll("\\s+"," ").trim(); 
		
		    String words[]= str1.split("\\s");
		    
		    // return type for Split is an Array
		    
		System.out.println("number of words is  "+words.length);
		
	} }
