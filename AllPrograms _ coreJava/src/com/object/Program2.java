package com.object;
import java.lang.*;

public class Program2 {

	public static void main(String[] args) {
		
      Program pro=new Program();
      Program pro1=new Program();
      
      System.out.println(pro);
      System.out.println(pro1);
      System.out.println(pro.hashCode());
      System.out.println(pro.hashCode());
      
      System.out.println(pro.hashCode()==pro.hashCode());
      
      System.out.println(pro.equals(pro1));
      // first it will be false
      // when we overide equlas method
      // then it will return true
      
	}

}
