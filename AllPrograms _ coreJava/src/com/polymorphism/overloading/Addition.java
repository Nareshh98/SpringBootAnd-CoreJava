package com.polymorphism.overloading;

public class Addition {
	
	
	void add(int x,int y) {
		System.out.println("result :"+(x+y));  //number of parameters
	}
	void add(int x,int y,int z) {
		System.out.println("result :"+(x+y+z));
	}


	public static void main(String[] args) {
		Addition a =new Addition();
		a.add(3,4);
		a.add(3,3,3);
	
		

	}

}
