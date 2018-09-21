package com.interview;

public class FibonacciDemo {

	
	public static void main (String []args)
	{
		Fibonacci(10);
		int fib =recursionFib(10);
		
		System.out.println();
		System.out.println(fib);
		
	}
	public static void Fibonacci(int num)
	{
		int temp=num;
		num=0;
		int arr[]=new int[temp];
		arr[0]=0;
		arr[1]=1;
		num=num+2;
			while(num<temp)
			{

        arr[num]=arr[num-1]+arr[num-2];
        
			
			num++;
			}
			
			for (int i=0;i<arr.length;i++)
			{
				System.out.print(arr[i]);
			}
		
	}
	
	public static int recursionFib(int num)
	{      
		if (num==0)
		{
			return 0;
		}
		if(num==1)
		{
			return 1;
		}

        int fibatn=recursionFib(num-1)+recursionFib(num-2);
		return fibatn;
	}
	
	
}
