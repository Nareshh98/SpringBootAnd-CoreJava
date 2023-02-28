package com.streamAPis;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ForEachDemo {

	public static void main(String[] args) {
		
		List<String> list =new ArrayList<>();
		list.add("Naresh");
		list.add("Arjun");
		list.add("Raj");
		list.add("Akhil");
            
		for(String s:list) {
			System.out.println(s);
		}
		
		System.out.println("==============");
		
		list.stream().forEach(t->System.out.println(t));
			
		//list.forEach(null);
       Consumer<String> consumer=(t)->System.out.println(t);
		
		consumer.accept("hello world");
		
		System.out.println("==============");
		for(String s1:list) {
			consumer.accept(s1);
		}		
	}
}
