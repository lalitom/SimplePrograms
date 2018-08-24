package com.interview;

public class ReverseString 
{
	
	
	public static void main (String args[])
	{
		
	String str="Lalit";
	//char ch[] = null;
	int length=str.length();
	char[] ch=new char[length];
	int temp=str.length()-1;
	for (int i=0;i<length;i++)
	{
		char tempchar;
		tempchar=str.charAt(temp);
		ch[i]=tempchar;
	temp--;
	
	}
	
	System.out.println(ch);
	
	
	
	
	}	
	
	
	
	
	
	
	
	
	
	

}
