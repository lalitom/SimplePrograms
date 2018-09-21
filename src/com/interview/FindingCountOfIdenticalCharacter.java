package com.interview;
import java.util.HashMap;
import java.util.Map;
public class FindingCountOfIdenticalCharacter {

	public static void main(String[] args) {

		String str="LalitLa";
		int length=str.length();
		
		Map<Character,Integer> hashmap=new HashMap<Character,Integer>();
		
		for(int i=0;i<str.length();i++)
		{
			char ch= str.charAt(i);
			if(hashmap.containsKey(ch))
			{
				int cnt=hashmap.get(ch);
				hashmap.put(ch,++cnt);
				
			}
			else
			{
				hashmap.put(ch,1);
			}
			
			
		}
		for(Character ch:hashmap.keySet())
		{
			System.out.println("Keys "+ch);
		}
		for(Integer values :hashmap.values())
		{
			System.out.println("Values "+values);
		}
		
		
		
		
		
	}

}
