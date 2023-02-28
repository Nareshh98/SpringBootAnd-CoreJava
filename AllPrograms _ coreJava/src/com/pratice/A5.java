package com.pratice;

import java.util.Arrays;

public class A5 {

	public static void main(String[] args) {
		int a[]=new int [] {1,20,3,10,35,5,6,8};
		
		int temp=a[a.length-1];
		
		for(int i=a.length-2;i>=0;i--) {
	
			a[i+1]=a[i];
		}
		
	     a[0]=temp;
		
		System.out.println(Arrays.toString(a));
		
	}	
}
