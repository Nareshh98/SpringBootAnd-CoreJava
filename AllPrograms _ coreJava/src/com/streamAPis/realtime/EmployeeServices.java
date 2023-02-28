package com.streamAPis.realtime;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeServices {
	
	public static List<Employee> evaluateTaxUsers(String input){
		
	return(	
			(input.equalsIgnoreCase("tax"))
		?DataBase.getEmployees().stream().filter(emp->emp.getSalary()> 800000).collect(Collectors.toList()) 
	     :DataBase.getEmployees().stream().filter(emp->emp.getSalary()<=800000).collect(Collectors.toList()));

	}
	public static void main(String[] args) {
		System.out.println(evaluateTaxUsers("non-tax"));
	}

	
}
