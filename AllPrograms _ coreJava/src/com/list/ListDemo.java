package com.list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> m1=new ArrayList<>();
		ArrayList<Integer> m2=new ArrayList<>(List.of(50,60,70,80,90));

		m1.add(10);
		m1.add(0,5);   // m1.add(index,element);
		//m1.addAll(m2);
		
		m1.addAll(1,m2);          //ma.addAll(index,list)
		m1.add(5,70);
		System.out.println(m1);
		System.out.println(m1.contains(60));
		System.out.println(m1.get(1));
		System.out.println(m1.indexOf(70));
		System.out.println(m1.lastIndexOf(70));
		m1.set(6, 100);  //it will update the value at given index
		System.out.println(m1);
		
	}

}
