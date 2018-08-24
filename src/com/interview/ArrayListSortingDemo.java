package com.interview;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListSortingDemo {
	
	
	
	public static void main (String[] args){
		
		int arr[] = new int[5];
		arr[0]=22;
		System.out.println(arr[0]);
		
		int [] arraydemo={23,45,67,78,99,34};
		Arrays.sort(arraydemo);
		display(arraydemo);
		int [] arraydemoList={23,45,67,78,99,34};
		ArrayList arrlist=new ArrayList();
		arrlist.add(arraydemoList);
		displayarraylist(arrlist);
		
		
		int a1[] = {1,2,3};
		ArrayList<Integer> arl=new ArrayList<Integer>();
		
		for(int i : a1) {
		    arl.add(i);        
		     }
		     
			displayarraylist(arl);
		
	}
	
	public static void display(int arr[])
	{
		for (int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
	}
	public static void displayarraylist(ArrayList arr)
	{
		for (int i=0;i<arr.size();i++)
		{
			System.out.println("Arraylist contains:" + arr.get(i));
		}
		
	}
	

}
