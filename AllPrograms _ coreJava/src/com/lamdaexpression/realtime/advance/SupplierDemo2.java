package com.lamdaexpression.realtime.advance;

import java.util.Arrays;
import java.util.List;

public class SupplierDemo2  {
	public static void main(String[] args) {
		
//		Supplier<String> supplier=()->{ return "hi naresh";
//		
//		                };

	//	Supplier<String> supplier=()-> "hi naresh";
	                
		// or 
		
		
	    //  List<String> list1=Arrays.asList("a","b");  //run this also
	      List<String> list1=Arrays.asList();

	      System.out.println( list1.stream().findAny().orElseGet(()-> "hi naresh"));
	    	
		}
		
	}

