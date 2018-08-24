package com.interview;

public class PalindromeByStringBuilder {
	
	public static void main(String args[])
	{
		StringBuilder stringbuilderdemo=new StringBuilder("NITIN");
		String intial=stringbuilderdemo.toString();
		String reverse=stringbuilderdemo.reverse().toString();
		
		if(reverse.equalsIgnoreCase(intial))
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}
		
		
	}
	

}
