package com.multithreading;

public class Multithreading5 implements Runnable {

String name;
	
	public Multithreading5(String name1) {
		name = name1;
	}
		
	@Override
	public void run() {		
		
		for(int i=1;i<=10;i++) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		System.out.println(name+":"+i);			 
			 }
		}
		
	public static void main(String[] args) {
		
		Multithreading5 m1=new  Multithreading5("Thread 1 ");	
		Multithreading5 m2=new  Multithreading5("Thread 2 ");
;
			 Thread t1=new Thread(m1);
			 Thread t2=new Thread(m2);
			
			 t1.start();
			 try {
				t1.join();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			 t2.start();
			 for(int i=1;i<=10;i++) {
				System.out.println("main :"+i);	
		}
	}
}