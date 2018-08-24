package com.learning.threads;

 class ImpRunnable1 implements Runnable
{
	 Thread th;
	// String name;
   static int  sum =0;
	@Override
	public void run() {
		
		sum=sum+10;
		System.out.println("Running in run"+Thread.currentThread().getName());
		System.out.println(sum);
	}
	
	ImpRunnable1(String name)
	{
		th=new Thread();
		th.setName(name);
	}
	
	
}


public class ImpRunnableCommonVariable {
	
	
	public static void main(String args[]) throws InterruptedException
	{
		
		Thread T1= new Thread(new ImpRunnable1("ONE"));
		T1.start();
		Thread.sleep(1000);
		Thread T2=new Thread(new ImpRunnable1("TWO"));
		T2.start();
		Thread T3=new Thread(new ImpRunnable1("TWO"));
		T3.start();
		Thread.sleep(1000);
		System.out.println(T3.getState());
		
	

}
}
