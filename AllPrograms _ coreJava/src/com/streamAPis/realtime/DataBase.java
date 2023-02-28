package com.streamAPis.realtime;

import java.util.ArrayList;
import java.util.List;

public class DataBase {

	public static List<Employee>getEmployees(){
		
		List<Employee> list=new ArrayList<>();
		
		list.add(new Employee(101,"Naresh","IT",600000));
		list.add(new Employee(102,"raj","IT",1000000));
		list.add(new Employee(103,"Arjun","CIVIL",700000));
		list.add(new Employee(104,"Akhil","EEE",800000));
			
		return list;		
	}
}
