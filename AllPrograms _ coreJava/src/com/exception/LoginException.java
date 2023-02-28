package com.exception;

public class LoginException extends Exception {

	public LoginException(String Message) {
		super(Message);
		
		// witho out this super we can print message 
		// if use super keyword this superkeyword   will call the parent constructor -->exception
	  
	}

}
