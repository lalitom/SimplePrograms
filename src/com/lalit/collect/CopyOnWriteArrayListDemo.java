package com.lalit.collect;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
	
	
	public static void main(String[] args)
	{
		CopyOnWriteArrayList<String> cowa=new CopyOnWriteArrayList<String>();
		cowa.add("Lalit");
		cowa.add("Kumar");
		cowa.add("Jobless");
		
		System.out.println("Iterating the CopyOnWriteArrayList");
		Iterator<String> itr =cowa.iterator();
		
		while(itr.hasNext())
		{
			
			System.out.println(itr.next());
		}
		
		
		
		
		
		
	}

}
