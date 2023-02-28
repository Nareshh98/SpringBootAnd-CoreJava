package com.polymorphism.overloading;



public class Sample extends Ab{
	
	void display(int x) {
		System.out.println("child  calss"+x);
	}
	
	public static void main(String[] args) {           //inherating overload
		
		Sample s =new Sample();
		s.display();
		s.display(5);
		
	}
	
}
