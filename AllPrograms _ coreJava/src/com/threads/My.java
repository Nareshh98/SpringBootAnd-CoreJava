package com.threads;

public class My implements Runnable {

	@Override
	public void run() {

		int i=1;
		while(true) {
			System.out.println(i +"hello");
			i++;
		}

	}
	public static void main(String[] args) {
		
	//	Thread t= new Thread("My Name"); // thread name
		
		Thread t= new Thread(new My(),"Thread 1");
		
	}

}
