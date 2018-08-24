package com.interview;

public class Primenumber {
	public static void main(String args[])
	{
		
		isprime(6);

		
	}
	
	static void isprime(int n)
	{
		int i=0,m=0,flag=0;
		m=n/2;
		
		if(n==0||n==1)
		{
			
			System.out.println("Not a prime number");
		}
		else
		{
			System.out.println("inside else");
		  if(n%2!=0)	
		  {    System.out.println("inside n%2!=0");
			for (i=2;i<=m;i++)
			{     System.out.println("for");
				if(n/i==0)
				{     System.out.println("inside n/i==0");
					System.out.println("number is not prime");
					flag=1;
					System.out.println(flag);
					break;
				}
				
			}
			if(flag==0)	
			{
				
				System.out.println("number is prime");
			}  
			  
		  }
			
		  
		}
		

		
	}

}
