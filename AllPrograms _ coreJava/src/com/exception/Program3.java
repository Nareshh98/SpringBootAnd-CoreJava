package com.exception;

import java.util.Arrays;

public class Program3 {	
		public static void main(String[] args) {
			try {		
			
			System.out.println(20/0);
			}
			catch(ArithmeticException e) {
					    	
				System.out.println(Arrays.toString(e.getStackTrace())); 
				
				// it will print in the form of Adders
				//we have to convert into Sting
				// it will give information about exact line exception occurs
			}}	}

