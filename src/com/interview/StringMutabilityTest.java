package com.interview;

public class StringMutabilityTest {
	
	public static void main (String args[])
	{
	  final String finalstring="abc";
	//  finalstring="def"; this gives error as final string can't be modified
		String str="abc";
		
		str="efg";
		
		System.out.println(str);
		
		String str1="efg";
		
		if(str1==str){
			System.out.println("Both equal as both point to same memory location as both are refrence to single memory location");
		}
		
		String str2=new String("efg");
		if(str2==str1)
		{
			System.out.println("matches");
		}
		else
		{
			System.out.println("objects with same value but doesn't matches due to string immutable nature");
		}
		
		//asked in an interview
		System.out.println("abc".charAt(0));
		
		
	}
	
	
	

}
