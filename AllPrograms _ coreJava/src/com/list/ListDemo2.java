package com.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo2 {

	public static void main(String[] args) {
		ArrayList<Integer> m1=new ArrayList<>();
		ArrayList<Integer> m2=new ArrayList<>(List.of(50,60,70,80,90));

		m1.add(10);
		m1.add(0,5);   // m1.add(index,element);
		m1.addAll(2,m2);
		System.out.println(m1);
		System.out.println(" ........forloop");
	
		for(int i=0;i<m1.size();i++) {
			
			System.out.println(m1.get(i));
		}
		System.out.println("====================================");
		System.out.println(" ........for each");
		for(Integer x:m1) {
			System.out.println(x);
		}
		System.out.println("====================================");
		System.out.println(" ........Iterator");
		
		Iterator<Integer> it=m1.iterator();
		
		while(it.hasNext()) {          //  it will check  the next element is there or not
			
			System.out.println(it.next());   // it will print the element and go to next element
		}
		System.out.println("====================================");
		System.out.println(" ........ListIterator");
		
		for(ListIterator<Integer> itr=m1.listIterator(); itr.hasNext();) {
			
			System.out.println(itr.next());
			
		}
		System.out.println(" ........Lamda expression");
		
		m1.forEach(n->System.out.println(n));
		
		
	   System.out.println(" ........*****************************");
	
	     m1.forEach(System.out::println);
	
	}
}

	

