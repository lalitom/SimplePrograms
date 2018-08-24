package com.learning.threads;

public class ImplementRunnableDemo implements Runnable {
	
	
	String nameofthread;

	
	public void run() {
		System.out.println("Inside Run"+Thread.currentThread().getName());
		
		
	}
	

	
	ImplementRunnableDemo(Thread th,String name)
	{
	 
	th.setName(name);
		System.out.println("Inside constructor");
	}
	     public static void main (String args[])
	     {
	    	 
	System.out.println("Inside Main");
	Thread t1=new Thread();
	t1.start();
	Thread t2=new Thread();
	t2.start();
	

}
}

