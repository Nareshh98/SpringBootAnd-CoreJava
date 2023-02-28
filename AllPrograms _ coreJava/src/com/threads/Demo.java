package com.threads;

public class Demo extends Thread {
	
	@Override
	public void run() {
					
			int i=1;
			while(true) {
				System.out.println(i +"hello");
				i++;
			}
		}

	public static void main(String[] args) {
		
		Demo t=new Demo();
          t.start();  
		
		
		int i=1;
		while(true) {
			System.out.println(i +"world");
			i++;
		}
	}

}
