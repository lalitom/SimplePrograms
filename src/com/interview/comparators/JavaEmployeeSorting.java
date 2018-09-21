package com.interview.comparators;

import java.util.Arrays;

public class JavaEmployeeSorting {

	public static void main(String[] args) {

		Employee arr[]=new Employee[5];
		arr[0]=new Employee(01,"Lalit",30,50000);
		arr[1]=new Employee(04,"Kumar",30,35000);
		arr[2]=new Employee(03,"Koks",12,40000);
		arr[3]=new Employee(02,"Loks",12,36000);
		arr[4]=new Employee(01,"Lalit",30,45000);
		//Sorting employees array using Comparable interface implementation
		Arrays.sort(arr);
		System.out.println("default sorting in:\n"+Arrays.toString(arr));
		
		//sorting employees array using Comparator by salary
		Arrays.sort(arr, Employee.SalaryComparator);
		System.out.println("Employee list sorted by Salary:\n"+Arrays.toString(arr));
		
		//sorting employees array using Comparator by Age
		Arrays.sort(arr,Employee.ageComparator);
        System.out.println("Employee list sorted by Age:\n"+Arrays.toString(arr));
        //sorting employees array using Comaprator by Name
        Arrays.sort(arr,Employee.nameComparator);
        System.out.println("Employee list is sorted by Name:\n"+Arrays.toString(arr));
        // sorting employees array using EmployeeComparatorByIdAndName
        Arrays.sort(arr,new EmployeeComparatorByIdAndName());
        System.out.println("Employees list sorted by Id and Name:\n"+Arrays.toString(arr));
        
	}

}
