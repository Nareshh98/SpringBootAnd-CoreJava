package com.multithreading;

public class MultiTHreading3 implements Runnable {



	@Override
	public void run() {
		Thread t =Thread.currentThread();          // to find the current location
		System.out.println(t);
	

	}
	public static void main(String[] args) {
		 MultiTHreading3 m1=new  MultiTHreading3();
		 Thread t1=new Thread(m1);
		 t1.start();
		
		 Thread t =Thread.currentThread();
			System.out.println("main : "+t);
				
	}


}
