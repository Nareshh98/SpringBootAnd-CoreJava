package com.threads;

public class MyThread extends Thread {
	
	@Override
	public void run() {
		
		int count=1;
		while(true) {
			System.out.println(count++ +" my thread");
		}
	}
	
}
