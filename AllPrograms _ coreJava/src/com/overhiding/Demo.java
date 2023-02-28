package com.overhiding;

public class Demo extends Overhinding {
	
	static void m1() {
		System.out.println("parent method");
	}


	public static void main(String[] args) {
		
		Demo d= new Demo();
		d.m1();
		
	}

}
