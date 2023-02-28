package com.threads;


public class Test2 {

	public static void main(String[] args) {
		My m=new My();
		
		Thread t=new Thread(m);
		// if we use runnable interface we have to create object of thread 
		// then we have to pass object of refference class to thread 
		
		t.start();
		int i=1;
		while(true) {
			System.out.println(i +"world");
			i++;
		}
	}
}
