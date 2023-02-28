package com.multithreading;

public class Multithreading extends Thread {  //by using class
	
	public void run() {
		System.out.println("run method");
		
	}
	public static void main(String[] args) {
		Multithreading m1=new Multithreading();
		Thread t=new Thread(m1);
		t.start();
		
		
	}
	

}
