package com.lamdaexpression.realtime.advance;

import java.util.Arrays;
import java.util.List;

public class PredicateDemo2 {	

	public static void main(String[] args) {
		
//		Predicate<Integer> predicate=(t)->{
//		if(t%2==0) {
//			return true;
//		}
//		else
//		
//		return false;
//          };
		
/*	Predicate<Integer> predicate= t-> t%2==0;
	
     System.out.println(predicate.test(5));  */
     
     List<Integer> list1=Arrays.asList(1,2,3,4,5);

     list1.stream().filter(t-> t%2==0).forEach(t->System.out.println("print even : "+t));
   	
	}
}
