package com.interview;

public class Pattern1 {
	
public static void main (String args[])
{  int n=5,k=2*n-2;


	
	for (int i=0;i<=n-1;i++)
	{

      for (int j=0;j<k;j++)
      {
    	  System.out.print(" ");
      }
      k=k-1;
      for(int j=0;j<i;j++)
      {
    	  
      System.out.print("* ");
      }
      System.out.println();
	}
	

}
	
	
	

}
