package com.pratice;

import java.util.Arrays;
import java.util.Collections;

public class A1 {

	public static void main(String[] args) {
		Integer a[]=new Integer [] {1,6,3,4,5,5,4,6};
		
		Integer b[]=new Integer [a.length];
		int j=0;
	
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		for(int i=0;i<a.length-1;i++) {
			
			if(a[i]!=a[i+1]) {
				b[j++]=a[i];
			}
		}
		
		Arrays.sort(a,Collections.reverseOrder());
		
		System.out.println(Arrays.toString(b));
			
	}
}
