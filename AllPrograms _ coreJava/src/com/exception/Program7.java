package com.exception;

public class Program7 {	
		public static void main(String[] args) throws Exception  {
			
			try {
				System.out.println(25/0);
			} catch (ArithmeticException e) {
				
				throw new LoginException("we created new Exception name is LoginException");
			}				
	}}


			