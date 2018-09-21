package com.interview.Algos;

public class Insertionsort {

	public static void main(String[] args) {
	
		int arr[]={23,5,78,990,4,67,83,234};
		int arraylength=arr.length;
		
		for (int i=1;i<arraylength;++i)
		{
			int key=arr[i];
			int j=i-1;
			
			while(j>=0 && arr[j]>key)
			{
				arr[j+1]=arr[j];
				j=j-1;
				
			}
			arr[j+1]=key;
			
		}
		
		
		for (int i=0;i<arraylength;i++)
		{
			
			System.out.println(arr[i]);
		}
	}

}
