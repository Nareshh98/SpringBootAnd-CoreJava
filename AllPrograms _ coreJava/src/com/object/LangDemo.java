package com.object;

public class LangDemo {

	public static void main(String[] args) {
		
		MyObject o1=new MyObject();
        MyObject o2=new MyObject();
        
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o1.hashCode());
        System.out.println(o2.hashCode());
        
        System.out.println(o1.hashCode()==o2.hashCode());
        
        
        System.out.println(o1.equals(o2));
        // first it will be false
        // when we overide equlas method
        // then it will return true

	}

}
