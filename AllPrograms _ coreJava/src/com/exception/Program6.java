package com.exception;



public class Program6 {	
		public static void main(String[] args) {
			
			int arr[]= {0,1,4,7};
			
			try {
				
				System.out.println(arr[5]);
				System.out.println(arr[2]/1);
				
			    }catch (ArrayIndexOutOfBoundsException ex) {
			    	
					ex.printStackTrace();
					System.out.println("please give valid index");
					
				}catch (ArithmeticException e) {
					
					e.printStackTrace();
					System.out.println("please dont divded with zero");
					
				}
	}
}

			