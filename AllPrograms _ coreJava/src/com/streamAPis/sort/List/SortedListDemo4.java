package com.streamAPis.sort.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.streamAPis.realtime.DataBase;
import com.streamAPis.realtime.Employee;

public class SortedListDemo4 {

	public static void main(String[] args) {
	
		List<Integer> list =new ArrayList<>();
		
		list.add(8);
		list.add(3);
		list.add(12);
		list.add(4);
		list.add(2);
				
		List<Employee> employee=DataBase.getEmployees();
		
//		Collections.sort(employee,new Comparator<Employee>() {
//
//			@Override
//			public int compare(Employee o1, Employee o2) {
//				
//				return (int) (o1.getSalary()-o2.getSalary());
//			}
//				
//		});
		
		Collections.sort(employee,(o1, o2)-> {
	
				return (int) (o1.getSalary()-o2.getSalary());
							
		});
				
		System.out.println(employee);

	}

}
	
	

