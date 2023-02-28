package com.hashmap;

import java.util.HashMap;

public class Hashmap2 {

	public static void main(String[] args) {
		HashMap<String,String> m=new HashMap<String,String>();
		m.put("101", "naresh");
		m.put("102", "naresh");
		m.put("103", "raj");
		m.put("104", "");
		m.put("", "123");
		m.put("", "222");
		m.put("105", "");
		System.out.println(m);
		
	}

}
