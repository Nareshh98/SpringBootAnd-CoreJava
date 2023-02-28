package com.bank.exceptions;


public class ExceptionResponse {
   
private    String errorMessage;
private    String RequestedURI;
   
   public String getErrorMessage() {
      return errorMessage;
   }
   public void setErrorMessage(String errorMessage) {
      this.errorMessage = errorMessage;
   }
   public String getRequestedURI() {
	      return RequestedURI;
	   }
	   public void setRequestedURI(String requestedURI) {
	      RequestedURI = requestedURI;
	   }
	   

	}

