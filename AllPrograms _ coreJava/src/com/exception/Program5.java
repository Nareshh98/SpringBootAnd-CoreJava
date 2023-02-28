package com.exception;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;

public class Program5 {	
	
		public static void main(String[] args) throws Throwable {
			
			
			File file =new File("C:\\Users\\naresh\\Documents\\naresh.text");
			
			if(!file.exists())
			file.createNewFile();
			
			// working with( try with resources)
			
			try(
		// a classes which implements  AutoClosable  only we have to pass in try  block
		// we no need to close			
					FileReader fr=new FileReader(file);   // this four are resources
					FileInputStream fis=new FileInputStream(file);
					InputStreamReader isr=new InputStreamReader(fis);
					BufferedReader br=new BufferedReader(isr);
					
				){
							
						String text=new String();
						String line =new String();
						
						while((line =br.readLine()) != null){
							
							text += line+"\n";
						}
						System.out.println(text);
			    }
			catch (Exception ex) {
				ex.printStackTrace();			
			}					
	}
}

			