package com.optional;

import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {
	
		User user=new User();
		// System.out.println(user.getUserName());
		
		Optional<String> userName =user.getUserName();
		
	
		
		if (userName.isPresent() && userName.get().equalsIgnoreCase("Naresh")) {
			System.out.println("Name is equal to Naresh");
		}
		else {
			System.out.println("not equals");
		}

	}

}

class User{
	private String userName;

	public Optional<String> getUserName() {
		return Optional.ofNullable(userName);
	}
	
}

/*
//System.out.println(emailoptional2.orElse("@gmail.com"));


//    System.out.println(emailoptional2.orElseThrow(()->new IllegalArgumentException("email not present")));

System.out.println(emailoptional2.map(String ::toUpperCase).orElseGet(()->"default eail......"));


} */