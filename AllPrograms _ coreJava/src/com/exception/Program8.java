package com.exception;

public class Program8 {	
		public static void main(String[] args)  {
			
			try {
			      System.out.println(25/0);
			      
			 } catch (ArithmeticException e) {
			    throw new ArithmeticException("Dont divided by zero");
			 } 
		}}



			