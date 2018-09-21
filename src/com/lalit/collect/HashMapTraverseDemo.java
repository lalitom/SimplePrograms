package com.lalit.collect;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapTraverseDemo {

	public static void main(String[] args) {

	Map<String,String>	gfg=new HashMap<String,String>();
	
		//traversing by Map.entrySet() iterating over for each loop
	
	  gfg.put("GFG", "geeksforgeeks.org"); 
      gfg.put("Practice", "practice.geeksforgeeks.org"); 
      gfg.put("Code", "code.geeksforgeeks.org"); 
      gfg.put("Quiz", "quiz.geeksforgeeks.org");
	 for(Map.Entry<String,String> entry :gfg.entrySet())
	 {
		 
		 System.out.println("Key is "+entry.getKey()+" ,value is "+entry.getValue());
	 }
	
	// iterating over keys and values by keyset() and values() function
	
	 for(String str:gfg.keySet())
	 {
		 System.out.println("Keys value are "+str);
	 }
	 for(String str:gfg.values())
	 {
		 System.out.println("Values are "+str);
	 }
	
	//Iterating using Iterators over Map.Entry<K,V>
	 
	 Iterator<Map.Entry<String, String>> itr= gfg.entrySet().iterator();
		
		while(itr.hasNext())
		{
			
			Map.Entry<String,String> entry=itr.next();
			System.out.println("Key = "+entry.getKey()+" ,Value = "+entry.getValue());
		}
		
		
		//ForEach(action) method to iterate map
		gfg.forEach((k,v)-> System.out.println("Key= "+k+" Value= "+v));
		
		//looping over keys and searching the value based on key
		
		for (String str:gfg.keySet())
		{
			String valuebasedonkey=gfg.get(str);
			System.out.println("Keys are "+str+"Values are "+valuebasedonkey);
		}

	}

}
