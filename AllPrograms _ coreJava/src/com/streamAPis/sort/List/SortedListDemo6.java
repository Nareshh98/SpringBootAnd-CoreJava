package com.streamAPis.sort.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.streamAPis.realtime.DataBase;
import com.streamAPis.realtime.Employee;

public class SortedListDemo6 {

	public static void main(String[] args) {
	
		List<Integer> list =new ArrayList<>();
		
		list.add(8);
		list.add(3);
		list.add(12);
		list.add(4);
		list.add(2);
			
		List<Employee> employee=DataBase.getEmployees();
	
		employee.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);
		System.out.println("========= sorting by salary");
		employee.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(System.out::println);
	
	}
}
	
	

