package com.bank.exceptions;



import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ExceptionControllerHandlerAdvice {
   
    @ExceptionHandler(ResourceNotFoundException.class)
    @ResponseStatus(value=HttpStatus.NOT_FOUND)
   @ResponseBody ExceptionResponse handleResourceNotFound(ResourceNotFoundException exception,HttpServletRequest request){
       
       ExceptionResponse myResponse=new ExceptionResponse();
       
       myResponse.setErrorMessage(exception.getMessage());
       myResponse.setRequestedURI(request.getRequestURI());
       
       
       return myResponse;
              
       }
    
    @ExceptionHandler(Exception.class)  //default
    @ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
   @ResponseBody ExceptionResponse defaultException(Exception exception,HttpServletRequest request){
       
       ExceptionResponse myResponse=new ExceptionResponse();
       
       myResponse.setErrorMessage(exception.getMessage());
       myResponse.setRequestedURI(request.getRequestURI());
       
       
       return myResponse;
              
       }

}
 
