package com.multithreading;

public class MultiThreading2 implements Runnable {   // by using interface

	@Override
	public void run() {
		
		System.out.println("run v method");
	}
	public static void main(String[] args) {
		MultiThreading2 m1=new MultiThreading2();
		Thread t=new Thread(m1);
		
		t.start();

	}

}
