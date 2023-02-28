package com.streamAPis.z.Parralel_stream;

import java.util.stream.IntStream;

public class Parralel_StreamExample {
	
	public static void main(String[] args) {
		long start=0;
		long end=0;
		
		
		start=System.currentTimeMillis();
		
		IntStream.range(1,100).forEach(System.out::println);
		
		end=System.currentTimeMillis();
		System.out.println("plain stream took time : "+(end-start));
		
		System.out.println("=================");
		// another way of creating parallel
		
		start=System.currentTimeMillis();
		
		IntStream.range(1,100).parallel().forEach(System.out::println);
		
		end=System.currentTimeMillis();
		
		System.out.println("parallel stream took time : "+(end-start));

		
		
		
		
	}

}
