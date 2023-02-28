package com.exception;

public class Program1 {
		

	public static void main(String[] args) {
		method1();
	}
	
		
		public static void method1() {
			method2();
		}

		private static void method2() {
			int a=5;
			int b=0;
			int result;
			
			  result=a/b;
			  
	     System.out.println(result);
		}
}
