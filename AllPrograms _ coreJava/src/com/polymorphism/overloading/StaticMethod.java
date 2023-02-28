package com.polymorphism.overloading;

public class StaticMethod {
	
	static void display(double x) {
		System.out.println("result 1 : "+x);   // static method overloading
	}
	static void display(int x) {
		System.out.println("result 2 : "+x);
	}
	

	public static void main(String[] args) {
		
		display(5);
		display(5.22);
		
	}

}
