package com.streamAPis.sort.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.streamAPis.realtime.DataBase;
import com.streamAPis.realtime.Employee;

public class SortedListDemo5 {

	public static void main(String[] args) {
	
		List<Integer> list =new ArrayList<>();
		
		list.add(8);
		list.add(3);
		list.add(12);
		list.add(4);
		list.add(2);
			
		List<Employee> employee=DataBase.getEmployees();
				
//		Collections.sort(employee,(o1, o2)-> {
//	
//				return (int) (o1.getSalary()-o2.getSalary());
//							
//		});
				
		// by using Streams
		// slary long conveting into int
		employee.stream().sorted((o1, o2)->(int) (o1.getSalary()-o2.getSalary())).forEach(System.out::println);
	
		System.out.println("=========");
		// comparing by own method 
		employee.stream().sorted(Comparator.comparing(emp->emp.getSalary())).forEach(System.out::println);
	}

	
}
	
	

