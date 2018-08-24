package com.learning.threads;

class ImpRunnable implements Runnable
{
   Thread th;
   String name;
   
	
	@Override
	public void run() {
		
		System.out.println("inside Run");
	}
	
	ImpRunnable(String name)
	{
		th=new Thread();
		th.setName(name);
	}
	
	
}


public class RunnableDemo2  {
	
	
	     public static void main (String args[])
	     {
	      ImpRunnable impr = new ImpRunnable("ONE");
	     System.out.println( impr.th.getName());
	      impr.th.start();/* not going to work you have to pass object of class
	       which has implemented interface Runnable like shown below*/
         Thread th1=new Thread(new ImpRunnable("TWO"));
         th1.start();
         }

	
	
}

