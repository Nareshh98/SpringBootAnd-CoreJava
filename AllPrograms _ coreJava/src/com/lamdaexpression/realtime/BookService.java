package com.lamdaexpression.realtime;

import java.util.Collections;
import java.util.List;

public class BookService {
	
	public List<Book> getBooksInSort(){
		
		List<Book> books=new BookDAO().getBooksDetials();
		
//		Collections.sort(books, new Comparator<Book>() {
//		
//		@Override
//		public int compare(Book o1, Book o2) {
//			
//			return o1.getName().compareTo(o2.getName());
//		}
//		});
		
		Collections.sort(books,(o1,o2)->
		  o1.getName().compareTo(o2.getName()));
		 return books;	
	}
	
	public static void main(String[] args) {
		
		System.out.println(new BookService().getBooksInSort());
	}

}

//class MyCompartor implements Comparator<Book>{
//
//	@Override
//	public int compare(Book o1, Book o2) {
//		
//		return o1.getName().compareTo(o2.getName());
//	}
//	
//}