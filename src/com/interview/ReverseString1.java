package com.interview;

public class ReverseString1 
{
	
	
	public static void main (String args[])
	{
		
	String str="Lalitreyreyer";
	//char ch[] = null;
	int length=str.length();
	String reverse="";
	int forlooplength=length;
	String substring = null;
	
	for (int i=0;i<forlooplength;i++)
	{
		if(length==0)
		{
			System.out.println(reverse);
		}
		
	reverse=reverse+str.substring(length-1, length);
	//System.out.println(reverse);
	length--;
	
	
	}	
	
	System.out.println(reverse);
	
	}
	
	
	
	
	
	

}
