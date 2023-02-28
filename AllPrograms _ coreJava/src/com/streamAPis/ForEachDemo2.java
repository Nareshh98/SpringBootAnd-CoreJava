package com.streamAPis;

import java.util.ArrayList;
import java.util.List;

public class ForEachDemo2 {

	public static void main(String[] args) {
		
		List<String> list =new ArrayList<>();
		list.add("Naresh");
		list.add("Arjun");
		list.add("Raj");
		list.add("Akhil");
            
		for(String s:list) {
			if(s.startsWith("A")) {
	        	System.out.println(s);
			}
		}
		System.out.println("====================");
		list.stream().filter(t->t.startsWith("A")).forEach(t->System.out.println(t));
			
	}
}
