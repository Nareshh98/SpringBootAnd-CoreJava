package com.streamAPis.sort.Maps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortingMap3 {
	
    public static void main(String[] args) {
    	
    	Map<String,Integer> map=new HashMap<>();
    	map.put("Eight", 8);
    	map.put("four", 4);
    	map.put("ten", 10);
    	map.put("two", 2);
   
    	// by using Stream
    	
    	map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
    	System.out.println("=========");
    	map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);   	    	
}

}
