package com.pratice;

import java.util.Arrays;

public class A4 {

	public static void main(String[] args) {
		int a[]=new int [] {1,20,3,10,35,5,6,8};
		
		int temp=a[0];
		
		for(int i=1;i<=a.length-1;i++) {
			 
			a[i-1]=a[i];
		}
		
		a[a.length-1]=temp;
		
		System.out.println(Arrays.toString(a));
		
		
	}
	
}
