package com.interview.Algos;

public class SelectionSort {

	public static void main(String[] args) {
	
		int arr[]={23,45,67,107,45,78,98,89,44,68,77,77};
		int arrlen=arr.length;
		int min=arr[0];
		for (int i=0;i<arrlen;i++)
		{
			
		smallestinArray(arr,i,arrlen);
			
		}
		printArray(arr);

	}
	public static void smallestinArray(int arr[],int startindex,int lastindex)
	{         int min=arr[startindex];
	          int k=startindex;
		for(int i=startindex;i<lastindex;i++)
		{
			
			for(int j=i+1;j<lastindex;j++)
			{
				
				if(min>arr[j])
				{
					
					min=arr[j];
					k=j;
					
				}
			}
		}
		if(min==arr[startindex])
		{
			System.out.println("No need to swap as already sorted");
		}
		else
		{
			swap(arr,k,startindex);
			System.out.println("inside else");
			System.out.println(arr[k]);
			System.out.println(arr[startindex]);
		}
	}
	public static void printArray(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		System.out.println(arr[i]);
		
	}
	public static void swap(int[] arr,int index,int startindex)
	{
		int temp;
		temp=arr[index];
		arr[index]=arr[startindex];
		arr[startindex]=temp;
	}

}
