package com.streamAPis.sort.List;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortedListDemo {

	public static void main(String[] args) {
	
		List<Integer> list =new ArrayList<>();
		
		list.add(8);
		list.add(3);
		list.add(12);
		list.add(4);
		list.add(2);
		
//		Collections .sort(list);
//		System.out.println(list);
//
//		Collections .reverse(list);
//		System.out.println(list);
		
		list.stream().sorted().forEach(t->System.out.println(t));//ASE
		System.out.println("---------");
		list.stream().sorted(Comparator.reverseOrder()).forEach(t->System.out.println(t)); //desc
		

	}

}
