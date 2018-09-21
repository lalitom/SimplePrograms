package com.interview.comparators;

import java.util.Arrays;

public class EmployeeComparable {

	public static void main (String args[])
	{
		Employee arr[]=new Employee[4];
		arr[0]=new Employee(01,"Lalit",30,50000);
		arr[1]=new Employee(04,"Kumar",30,35000);
		arr[2]=new Employee(03,"Koks",12,40000);
		arr[3]=new Employee(02,"Loks",12,36000);
		
		Arrays.sort( arr);
		System.out.println("Default sorting of employee list"+Arrays.toString(arr));
		
		
		
	}
	
	
}
