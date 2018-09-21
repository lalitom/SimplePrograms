package com.interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashmapCountingCharacters {

	public static void main(String[] args) {
	String str="Lalitla";
	Map<Character,Integer>map=new HashMap<Character,Integer>();
	int n=str.length();
	for (int i=0;i<n;i++)
	{ 
		char ch= str.charAt(i);
		if (map.containsKey(ch))
		{   int cnt=map.get(ch);
		 // define value variable to just show that ++cnt leads to cnt+1 which is not with cnt++
		    int value=++cnt;
		    System.out.println(value);
			map.put(ch, value);
		}
		else
		{
		map.put(ch, 1);
		}
	}
	
	for (Map.Entry<Character, Integer> entry:map.entrySet())
	{
		
		System.out.println("Keys="+entry.getKey()+" Values="+entry.getValue());
		
	}
	

	}

}
