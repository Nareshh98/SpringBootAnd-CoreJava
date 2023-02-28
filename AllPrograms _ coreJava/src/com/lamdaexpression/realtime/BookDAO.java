package com.lamdaexpression.realtime;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {
	
	public List<Book> getBooksDetials(){
		
	 	List<Book> books=new ArrayList<>();
		
		books.add(new Book(101,"Core java",400));
		books.add(new Book(102,"Spring Boot",100));
		books.add(new Book(104,"Hibernate",200));
		books.add(new Book(105,"WebServices",300));
		return books;
			
		}
	}
	
	

