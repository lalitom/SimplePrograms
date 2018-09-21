package com.interview;

public class Factorial {

	public static void main(String[] args) {
		int num=5;
		
		int factorial=factorial(num);
		System.out.println(factorial);

	}
	public static int factorial(int num)
	{
		if (num==0)
		{
			return 1;
		}else if(num==1)
		{
			return 1;
		}
		int temp=num*factorial(num-1);
		return temp;
		
	}

}
