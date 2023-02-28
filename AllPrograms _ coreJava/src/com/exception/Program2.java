package com.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Program2 {
	public static void main(String[] args) throws FileNotFoundException,IOException{
	
			int a=5;
			int b=0;
			int result=0;
			
			File file =new File("D:/resume.docx");		// this file may be present or not.
			
			//By using throws keyword we are saying to JVM to handle the exception 
			
			FileInputStream fil=new FileInputStream(file);
			
			System.out.println(fil);
			
		try {	
			  result=a/b;
		}
		catch (ArithmeticException e) {
			
		//	e.printStackTrace();
			
			System.out.println(e.toString());
			
			throw e; //throw will  stop the program execution
		}
		
			  
	     System.out.println(result);	}		}
