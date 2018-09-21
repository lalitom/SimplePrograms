package com.interview.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class BiggestPalindrome {

	public static void main(String[] args) {
	
		String originalstr="IIAAINISDFGNNUUNITINNITTINNITIN";
		String str=originalstr;
		String str1=originalstr;
		HashSet<String> set=new HashSet();
		int maxpalindrome=0;
		setofStrings(str,set);
		palindromesearch(str, set);
		printvaluesofplaindrome(set);
		maxpalindrone(set);
	}
	
	public static void palindromesearch(String str,HashSet hs)
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
					hs.add(strim);
				}
			   
			   
			   System.out.println("substring=" +strim+" string length= "+strim.length()+" value of i="+i);
		   }
	}
	public static void printvaluesofplaindrome(HashSet hs)
	{
		
	
		
		 Iterator itr=hs.iterator();
		   while(itr.hasNext())
		   {
			   System.out.println("in hashset "+ itr.next());
			   
		   }
		   
	}
	public static void setofStrings(String str,HashSet hs)
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
	public static  void maxpalindrone(HashSet<String> hs)
	{
		
		
		ArrayList<String> arraylist=new ArrayList<>(hs);
		int maxlength=0;
		int wherethestringis=0;
 for(int i=0;i<arraylist.size();i++)
 {
      String str=  arraylist.get(i);
      //int wherethestringis=0;
       maxlength=str.length();
       if(maxlength<=str.length())
       {
    	   maxlength=str.length();
    	   wherethestringis=i;
       }
      
 }	
	System.out.println("The string is at i="+wherethestringis+arraylist.get(wherethestringis));
	}
	

}
