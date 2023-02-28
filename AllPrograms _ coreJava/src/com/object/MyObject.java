package com.object;

public class MyObject {

	// we can Override from object class 
		public String toString(){
	        return "My Object";
	    }
	    
	    public int hashCode(){
	        return 100;
	    }
	    public boolean equals(Object o){
	        return this.hashCode()==o.hashCode();
	    }

	}


