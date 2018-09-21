package com.interview.Algos;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {

		int arr[]={10,20,40,34,56,78,89,56,55};
		int arrlen=arr.length;
		PrintArray(arr);
		System.out.println("After sorting");
		mergesort(arr,0,arrlen);
		
	}
	public static int[] mergesort(int arr[],int l, int r)
	{
	    if((l==r)||r==0)
	    {
	    	int[]brr = new int[1];
	    	
	    
	    	brr[0]=arr[l];
	    	
	    	return brr;
	    }
	
		int m=(l+r)/2;
		mergesort(arr,l,m);
		mergesort(arr,m+1,r-1);
		return merge(arr,l,m,r-1);
		
		
	
		
  }
	public static int [] merge(int arr[],int l,int m,int r)
	{
		int mloop=m;
		for ( int i=l;i<r;i++)
		{
		if(arr[i]>arr[mloop+1])
		{   
			for(mloop++;mloop<=l-1;mloop--)
			{
				arr[mloop]=arr[mloop-1];
				
			}
			mloop++;
			
		}
			
		}
		
		return arr;
		
	}
	public static void PrintArray (int[] arr )
	{
		for(int i=0;i<arr.length;i++)
		{
			
			System.out.println("Array elments are ="+arr[i]);
			
		}
	}

}
