package com.polymorphism.overloading;

public class Addition1 {
	
	
	void add(int x,double d) {
		System.out.println("result :"+(x+d));  // types of parameter
	}
	void add(int x,int y) {
		System.out.println("result2 :"+(x+y));
	}


	public static void main(String[] args) {
		Addition1 a =new Addition1();
//		a.add(3,4);
		
		a.add(3,4.6);
		a.add(7, 7);
	
		

	}

}
