package com.streamAPis;

import java.util.HashMap;
import java.util.Map;

public class ForEachDemomap2 {

	public static void main(String[] args) {
				
		Map<Integer,String> map=new HashMap<>();
		
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		map.put(4, "d");
		map.put(5, "e");

		map.entrySet().stream().filter(k->k.getKey()%2==0).forEach(obj->System.out.println(obj));
}}