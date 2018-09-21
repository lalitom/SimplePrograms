package com.lalit.collect;

public class StackImp {

	public static void main(String[] args) {
		
		int arr[];
		arr= new int[10];
		int top;
		top=arr[0];
		
		printarray(arr);
		push(arr,5,0);
		newline();
		printarray(arr);
		newline();
		pop(arr,0);
		printarray(arr);
		
		
		

	}
	static void push(int arr[],int item,int top)
	{
		 if(top==arr.length)
		{
			System.out.println("Stack full");
		}
	
		
		else
		{
			arr[top]=item;
			top=top+1;
		}
		
		
	}
	static void pop(int arr[],int top)
	{
		arr[top]=0;
		top=top-1;
	}
	static void printarray(int arr[])
	{
		for (int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
	}
 static void newline()
 {
	 System.out.println("");
 }


}