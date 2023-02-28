package com.overriding;

public class Demo {
	
	void display() {
		System.out.println("child class");
	}                                         // over riding


	public static void main(String[] args) {
		
		Demo o=new Demo();
		o.display();
		Overriding a=new Overriding();
		a.display();
		
	
	}

}
