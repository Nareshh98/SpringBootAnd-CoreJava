package com.polymorphism.overloading;

public class MainOverloading {

	public static void main(int [] args) {     // main method over loading
		System.out.println("int array");
	

	}
	public static void main(int args) {
		System.out.println("integer");
	}
	
	public static void main(String[] args) {
		
		main(new int[] {4,5,6,7});
		main(25);
	
		
		

	}

}
