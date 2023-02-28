package com.threads;


public class MyThread2 extends Thread {

	MyData data;

	public MyThread2(MyData data) {
		this.data = data;
	}
	
	@Override
	public void run() {
		data.display("Welcome");
		
	 }
	}
