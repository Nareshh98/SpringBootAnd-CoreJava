package com.multithreading;

public class Multithreading4 implements Runnable {

	String name;
	
	public Multithreading4(String name1) {
		name = name1;
	}
		
	@Override
	public void run() {		
		
		for(int i=1;i<=10;i++) {
			
			try {
				Thread.sleep(1000);          //sleep method will take time to executed
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		System.out.println(name+":"+i);			 
			 }
		}
		
	public static void main(String[] args) {
		
		Multithreading4 m1=new  Multithreading4("Thread 1 ");	
		Multithreading4 m2=new  Multithreading4("Thread 2 ");

			 Thread t1=new Thread(m1);
			 Thread t2=new Thread(m2);
			
			 t1.start();
			 t2.start();
			 for(int i=1;i<=10;i++) {
				System.out.println("main :"+i);	
		}
	}
}
			
	
