package com.interview.strings;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class BiggestPalindromeHashMap {

	public static void main(String[] args) {
	
		String originalstr="IIAAINISDFGNNUUNITINNITTINNITIN";
		String str=originalstr;
		String str1=originalstr;
		Map<String,Integer> map=new HashMap<String,Integer>();
		int maxpalindrome=0;
		setofStrings(str,map);
		palindromesearch(str, map);
		printvaluesofplaindrome(map);
	
	}
	
	public static void palindromesearch(String str,Map hs)
	{
		 for(int i=0;i<str.length();i++)
		   {
			   
			  String strim=str;
			  strim=str.substring(i);
			  StringBuilder strbuilder=new StringBuilder(strim);
				String reverse=strbuilder.reverse().toString();
				System.out.println("reverse= "+reverse);
				if(reverse.equals(strim)&& strim.length()!=1)
				{
					hs.put(strim,strim.length());
				}
			   
			   
			   System.out.println("substring=" +strim+" string length= "+strim.length()+" value of i="+i);
		   }
	}
	public static void printvaluesofplaindrome(Map<String,Integer> hm)
	{
		for(Map.Entry<String,Integer> entry : hm.entrySet())
		{
			Collection<Integer>arr=hm.values();
			
			
			System.out.println("Key="+entry.getKey()+" Value="+entry.getValue());
			
		}
	
		
	}

	public static void setofStrings(String str,Map hs)
	{
		 String original=str;
		 String temp=str;
		 int n=str.length();
		for(int i=0;i<n;i++)
		{
			temp=str.substring(i,n);
			n--;
			System.out.println(temp);
			palindromesearch(str, hs);
			
		}
		
	}
	

}
