package com.pratice;

import java.util.Arrays;

public class A2 {

	public static void main(String[] args) {
		int a[]=new int [] {1,20,3,10,35};
		
		int max1=a[0];
		int max2=a[0];
		
		for(int i=0;i<=a.length-1;i++) {
			
			if(a[i]>max1) {
				max2=max1;
				max1=a[i];
			}
			else if (a[i]>max2) {
				 
				       max2=a[i];
			}
					
		}
		System.out.println(max1);
		System.out.println(max2);
		System.out.println(Arrays.toString(a));
	}
	
}
