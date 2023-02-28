package com.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hashmap {

	public static void main(String[] args) {
	//	HashMap m=new HashMap();
		HashMap<Integer,String> m=new HashMap<Integer,String>();
		m.put(101, "naresh");
		m.put(102, "raj");
		m.put(103, "Akhil");
		m.put(104, "Arjun");
		m.put(105, "Manoj");
		m.put(101, "Abc");    // no error it update the given value
		m.remove(101);
		HashMap<Integer,String> n=new HashMap<Integer,String>();
		n.put(106, "chandan");
		n.put(107, "babu");
		
		
		System.out.println(m);
		System.out.println(n);
	
		System.out.println(m.get(105));  
		m.putAll(n);                                //Adding list 
	
		System.out.println(m);  // after updated
		System.out.println(m.isEmpty());
		
		System.out.println(m.size());
		System.out.println(n.size());
		
		System.out.println(m.containsValue("Manoj"));
		
		System.out.println(m.containsKey(107));
		System.out.println(n.containsKey(107));
		
		System.out.println(m.keySet());  //all only key values[102, 103, 104, 105, 106, 107]
		
		//for(Object i:m.keySet()) {
	
		for(int i:m.keySet()) {
			System.out.println(i);
		}
		
		
		System.out.println(m.values()); //all only values [raj, Akhil, Arjun, Manoj, chandan, babu]
		
		for(String i:m.values()) {
			System.out.println(i);
		}
		
		System.out.println(m.entrySet()); //both will print [102=raj, 103=Akhil, 104=Arjun, 105=Manoj, 106=chandan, 107=babu]

		for(int i:m.keySet()) {
			System.out.println(i+"   "+m.get(i)); // by using get method we can retrue the value
		}
				
		for(Object i:m.entrySet()) {
			System.out.println(i);
		}
		// entery interface method
		System.out.println("***************************");
		System.out.println(m.entrySet());     
		
		for(Map.Entry entry :m.entrySet()) {
		
			
			System.out.println(entry.getKey()+"      "+entry.getValue());
			
		}
		System.out.println("***************************");
		//iterator
		Set s=m.entrySet();
		    Iterator itr= s.iterator();
		    
		    while(itr.hasNext())
		    {
		    	Map.Entry entry= (Entry) itr.next();
		    	System.out.println(entry.getKey() +"      "+ entry.getValue());
		    }
	  }
		   
		
	}


