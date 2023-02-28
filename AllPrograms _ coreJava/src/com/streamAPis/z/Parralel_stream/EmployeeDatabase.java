package com.streamAPis.z.Parralel_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EmployeeDatabase {
	
	public static List<Employee> getEmployee(){
		
		List<Employee> employee=new ArrayList<>();
		
		for(int i=1;i<=100;i++) {
			employee.add(new Employee(i,"employee"+i,"A",Double.valueOf(new Random().nextInt(1000*1000))));
		}
		return employee;
		
	}

}
