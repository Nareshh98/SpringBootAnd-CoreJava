package com.exception;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Program4 {	
	
		public static void main(String[] args) throws Throwable {
			
		//public static void main(String[] args) throws Exception {
			
	//public static void main(String[] args) throws FileNotFoundException, IOException {
			
		
			File file =new File("C:\\Users\\naresh\\Documents\\naresh.text");
			
			if(!file.exists())
			file.createNewFile();
			
			FileReader fr=new FileReader(file);
			FileInputStream fis=new FileInputStream(file);
			InputStreamReader isr=new InputStreamReader(fis);
			BufferedReader br=new BufferedReader(isr);
			String text=new String();
			String line =new String();
			
			while((line =br.readLine()) != null){
				
				text += line+"\n";
			}
			System.out.println(text);
			fis.close();
			isr.close();
			fr.close();
			br.close();
		}
}

			