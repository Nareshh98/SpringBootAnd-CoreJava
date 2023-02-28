package com.streamAPis.sort.Maps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import com.streamAPis.realtime.Employee;

public class SortingMapObject {
	
    public static void main(String[] args) {
    	
	
         Map<Employee,Integer> emloyeeMap=new TreeMap<>(new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				
				return (int) (o1.getSalary()-o2.getSalary());
			}
        	 
		});
		
         emloyeeMap.put(new Employee(101,"Naresh","IT",600000),60);
         emloyeeMap.put(new Employee(102,"raj","IT",1500000),90);
         emloyeeMap.put(new Employee(103,"Arjun","CIVIL",700000),50);
         emloyeeMap.put(new Employee(104,"Akhil","EEE",1000000),40);
         emloyeeMap.put(new Employee(105,"Manoj","EEE",1200000),120);
		
          System.out.println(emloyeeMap);
    	
    }
}