package com.interview.strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class RemovingCharactersOfSecondStringFromFirstString {

	public static void main(String[] args) {
        String str="Lalitla";String str1="Kumar";
        
        int n=str.length();
        int n1=str1.length();
        ConcurrentHashMap <Character,Integer> hm1 =new ConcurrentHashMap<Character,Integer>();
        ConcurrentHashMap<Character,Integer> hm2=new ConcurrentHashMap<Character,Integer>();
   for(int i=0;i<n;i++)
   {
	 char ch = str.charAt(i);
     hm1.put(ch, i);

	
   }
   for(int i=0;i<n1;i++)
   {
	 char ch = str1.charAt(i);
     hm2.put(ch, i);

	
   }
   
   for (Character keys:hm1.keySet())
   {
	    for(Character keys1:hm2.keySet())
	    {
	   if(keys==keys1)
	  {
		   hm1.remove(keys);
		   
	   }
	  	   
	   
	    }
   }
   for(Map.Entry<Character, Integer> entries:hm1.entrySet())
   {
	   System.out.println("Keys= "+entries.getKey()+"Values= "+entries.getValue());
   }

}
}