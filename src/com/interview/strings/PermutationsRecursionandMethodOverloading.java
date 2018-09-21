package com.interview.strings;

public class PermutationsRecursionandMethodOverloading {

	public static void Permutation(String str)
	{
		Permutation("",str);
		
	}
	
	public static void Permutation(String Prefix,String str)
	{
		int n=str.length();
		if(n==0)
		{
			System.out.println(Prefix);
		}
		else
		{
			
			for(int i=0;i<n;i++)
			{
				Permutation(Prefix+str.charAt(i),str.substring(0,i)+str.substring(i+1,n));
				
			}
		}
		
	}
	
	
	public static void main(String []args)
	{
		
		Permutation("Lalit");
	}
	
	
	
}
