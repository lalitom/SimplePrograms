package com.learning.threads;

public class ImplementRunnableDemo1 implements Runnable {
	
	Thread th;
	String nameofthread;

	
	public void run() {
		System.out.println("Inside Run");
		
		
	}
	
public void	startthethread()
{
	System.out.println("inside the start mehtod");
	//th.start();
}
	
	ImplementRunnableDemo1(String name)
	{
		this.th=new Thread();
		this.th.setName(name);
		
		System.out.println("Inside constructor");
	}
	     public static void main (String args[])
	     {
	    	 System.out.println("Inside Main");
	ImplementRunnableDemo1 ITD= new ImplementRunnableDemo1("First Thread");
	System.out.println(ITD.th.getName());
	ITD.startthethread();
	System.out.println("First object created");
	ImplementRunnableDemo1 ITD2=new ImplementRunnableDemo1("Second Thread");
	ITD2.th.start();
	System.out.println("Second object created");

}
}

