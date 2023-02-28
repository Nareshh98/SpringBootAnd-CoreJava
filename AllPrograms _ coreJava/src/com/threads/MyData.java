package com.threads;

public class MyData {
	 	
 synchronized void display (String str) {
	 
			//	synchronized (this) {
					for(int i=0;i<str.length();i++) 
						System.out.print(str.charAt(i)); 
					
			//	}	
		
	                                      
	   }
}
