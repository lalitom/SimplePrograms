package com.interview;

import java.util.ArrayList;
import java.util.Iterator;

public class LoopinginArrayList {

	public static void main(String args[])
	{
		ArrayList<Integer>arr1=new ArrayList<Integer>();
		arr1.add(10);
		arr1.add(16);
		arr1.add(7);
		arr1.add(45);
		
		System.out.println("for loop");
		for (int i=0;i<arr1.size();i++)
		{
			System.out.println("Arrays List element are as follows: "+arr1.get(i));
		}
		
		System.out.println("while loop");
		int count = 0;
		while(arr1.size()>count)
		{
			System.out.println("Arrays List element are as follows: "+arr1.get(count));
			count++;
		}
		
		System.out.println("Advance For loop");
		for (Integer num:arr1)
		{
			System.out.println(num);
		}
		System.out.println("iterator loop");
		Iterator iter=arr1.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		
		
		
	}
	
	
	
}
