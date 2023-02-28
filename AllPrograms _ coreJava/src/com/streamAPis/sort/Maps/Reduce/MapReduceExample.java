package com.streamAPis.sort.Maps.Reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MapReduceExample {

	public static void main(String[] args) {
		
		List<Integer> numbers=Arrays.asList(10,3,7,8,1,5,9);
		
		List<String> words=Arrays.asList("corejava","spring","springBoot");
		
		int sum=0;
		for(int no:numbers) {
			sum=sum+no;
		}
		System.out.println(sum);
		
		int sum1=numbers.stream().mapToInt(i->i).sum();
		System.out.println(sum1);
		
		Integer reduceSum=numbers.stream().reduce(0, (a,b)->a+b);
		System.out.println(">>>"+reduceSum);
		
		Optional<Integer> reduceSumWithMethodReference =numbers.stream().reduce(Integer ::sum);
		System.out.println(reduceSumWithMethodReference);

		Integer reduceMultiple=numbers.stream().reduce(1, (a,b)->a*b);
		System.out.println(reduceMultiple);
	
		Integer maxValue=numbers.stream().reduce(0, (a,b)->a>b?a:b);
		System.out.println(maxValue);
		
		Integer maxValueWithMethodReference=numbers.stream().reduce(Integer:: max).get();
		System.out.println(maxValueWithMethodReference);
		
		String longString=words.stream().reduce((word1,word2)->word1.length()>word2.length()?word1:word2).get();
		
		System.out.println(longString);
		
		//get employee whose grade A
		// get salarys
		
	double avgSalary=EmployeeDatabase.getEmployees().stream().
		       filter(employee ->employee.getGrade().equalsIgnoreCase("A"))
		       .map(employee ->employee.getSalary())
		       .mapToDouble(i->i).average().getAsDouble();
	
	System.out.println(avgSalary);
	
	double SumSalary=EmployeeDatabase.getEmployees().stream().
		       filter(employee ->employee.getGrade().equalsIgnoreCase("A"))
		       .map(employee ->employee.getSalary())
		       .mapToDouble(i->i).sum();
	
	System.out.println(SumSalary);
	
	
	}

}
