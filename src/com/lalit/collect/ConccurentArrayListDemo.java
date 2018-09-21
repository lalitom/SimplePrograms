package com.lalit.collect;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class ConccurentArrayListDemo {
	
	public static void main (String args[])
	{
		List<String> syncal=Collections.synchronizedList(new ArrayList<String>());
		syncal.add("Lalit");
		syncal.add("Kumar");
		syncal.add("Jobless");
		System.out.println("Iterating Synchronized List");
		Iterator<String> iter=syncal.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
	}
	

}
