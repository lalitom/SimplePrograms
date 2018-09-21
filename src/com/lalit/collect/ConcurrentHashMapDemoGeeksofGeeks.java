package com.lalit.collect;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemoGeeksofGeeks extends Thread {
	
	static ConcurrentHashMap<Integer,String> conhashmap=new ConcurrentHashMap<Integer,String>();
	
	public void run()
	{
		conhashmap.put(103,"D");
		System.out.println("The id of the thread running is "+currentThread().getId());
        
        try
        {
            Thread.sleep(2000);
            System.out.println("currentThread  inside try "+currentThread().getId());
        }
        catch(InterruptedException e)
        {
            System.out.println("Child Thread going to add element");
            System.out.println("currentThread inside catch "+currentThread().getId());
        }
	}

	public static void main(String[] args) throws InterruptedException {
		
		conhashmap.put(1, "Encapsulation");
		conhashmap.put(2,"Abstraction");
		conhashmap.put(3,"Polymorphism");
		conhashmap.put(4,"Inheritance");
		
		ConcurrentHashMapDemoGeeksofGeeks hashmapdemo=new ConcurrentHashMapDemoGeeksofGeeks();
		hashmapdemo.start();
		System.out.println("currentThread "+currentThread().getId());
		for(Object o:conhashmap.entrySet())
		{
			Object s=o;
			System.out.println(s);
			System.out.println("currentThread "+currentThread().getId());
			Thread.sleep(1000);
		}
		
		
		System.out.println(conhashmap);

	}

}
