package com.polymorphism.overloading;

public class Addition3 {

	void add(int x,double y) {
		System.out.println("result :"+(x+y));    // order of parameter
	}
	void add(double x,int y) {
		System.out.println("result2 :"+(x+y));
	}


	public static void main(String[] args) {
		Addition3 a =new Addition3();
//		a.add(3,4);
		
		a.add(3,4.6);
		a.add(7.1, 7);
	
		

	}

}
