package com.streamAPis.z.Parralel_stream;

import java.util.List;

public class Parralel_StreamExample2 {
	
	public static void main(String[] args) {
		long start=0;
		long end=0;
		
		

//		IntStream.range(1, 10).forEach(x->{
//			System.out.println("Thread : "+Thread.currentThread().getName()+" : "+x);		
//		});
//		
//		IntStream.range(1, 10).parallel().forEach(x->{
//			System.out.println("Thread : "+Thread.currentThread().getName()+" : "+x);		
//		});
		
		start=System.currentTimeMillis();
		
		List<Employee> employees=EmployeeDatabase.getEmployee();
		
		double salaryWithstream=employees.stream().map(Employee::getSalary).mapToDouble(i->i).average().getAsDouble();
		
		end=System.currentTimeMillis();
		System.out.println("plain stream took time : "+(end-start)+"  Average sal : "+salaryWithstream);
		
		// by using parallel streams
		
         start=System.currentTimeMillis();
		
		double salaryWithParallelstream=employees.parallelStream().map(Employee::getSalary).mapToDouble(i->i).average().getAsDouble();
		
		end=System.currentTimeMillis();
		System.out.println("parallel stream took time : "+(end-start)+"  Average sal : " +salaryWithParallelstream);
		
	}

}
