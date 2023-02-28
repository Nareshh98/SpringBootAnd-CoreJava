package com.threads;

public class MyThread1 extends Thread {
	
	MyData d;

	public MyThread1(MyData d) {
		this.d = d;
	}
	
	@Override
	public void run() {
		d.display("Hello World");
		
	 }
	}
