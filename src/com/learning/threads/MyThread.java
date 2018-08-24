package com.learning.threads;
class A implements Runnable
{
    public void run()
    {
        for( int i=0; i<5; i++)
        {
            System.out.println("Thread-A " +i + " Thread Name: "  +Thread.currentThread().getName());
        }
    }
}
class B implements Runnable
{
    public void run()
    {
        for( int i=0; i<5; i++)
        {

            System.out.println("Thread-B " +i + " Thread Name: "  +Thread.currentThread().getName() );
        }
    }
}

class MyThread 
{
    public static void main(String [] args)
    {
        Thread t1 = new Thread(new A());
        Thread t2 = new Thread(new B());

        t1.run();
        t2.run();
        System.out.println("**********************************************************");
        t1.start();
        t2.start();
    }
}