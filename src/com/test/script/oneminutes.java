package com.test.script;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class oneminutes
{
	
	public static void main(String args[]) throws IOException
	{
		int start=7;
		int start1=12;
		int maxrun=375;
		List fostock=new ArrayList();
		List BHstock=new ArrayList();
		List BLstock=new ArrayList();
		String foline=null;
		BufferedReader fo=new BufferedReader(new FileReader("D:\\datamarket\\FO\\fnostocks.txt"));
		
		while( ( foline = fo.readLine() ) != null )  {
			fostock.add(foline);  // single line from csv is being dumped
			   
			  }
		
		//System.out.println("FO Stock numbers"+fostock.size());
		
		for(int z=0;z<=fostock.size()-1;z++)
		{
		
		
		
		
		URL urlold = new URL("https://www.google.com/finance/getprices?f=d%2Cc%2Ch%2Cl%2Co%2Cv&p=2d&q="+fostock.get(z)+"&x=NSE");
		URL url = new URL("https://www.google.com/finance/getprices?f=d%2Cc%2Ch%2Cl%2Co%2Cv&i=60&p=1d&q="+fostock.get(z)+"&x=NSE");
		InputStream is = url.openConnection().getInputStream();
		InputStream isold = urlold.openConnection().getInputStream();
		String highold,lowold,openold,closeold,volumeold;
		double higholdvalue=0.0,lowoldvalue=0.0;
		float openoldvalue,closeoldvalue,volumeoldvalue;
		List high= new ArrayList();
		List low=new ArrayList();
		List open= new ArrayList();
		List close=new ArrayList();
		List<Integer> volume=new ArrayList();
		List Stockclose=new ArrayList();
		BufferedReader reader = new BufferedReader( new InputStreamReader( is )  );
		BufferedReader reader1 = new BufferedReader( new InputStreamReader( isold)  );
       ArrayList<String> a=new ArrayList<String>();
       ArrayList<String> aold=new ArrayList<String>();
	  String line,lineold = null;
		int count=0;
		while( ( line = reader.readLine() ) != null )  {
		   a.add(line);  // single line from csv is being dumped
		   count++;  // counts number of line in csv.

		     
		}
		reader.close();
		
		System.out.println("countofline"+count);
		
		int count1=0;
		while( ( lineold = reader1.readLine() ) != null )  {
		   aold.add(lineold);  // single line from csv is being dumped
		   count1++;  // counts number of line in csv.

		     
		}
		reader1.close();
		
		System.out.println("countofline"+count1);
		
		for (int i=7;i<=count-7+1;i++)
		{
		String[] temp= a.get(i).split(",");
		
		//System.out.println(temp[0]);
	   float highmax;
	   float lowmin;
		//DATE,CLOSE,HIGH,LOW,OPEN,VOLUME
	 // List high= new ArrayList();
	    high.add(temp[2]);
	    low.add(temp[3]);
	    close.add(temp[1]);
	    open.add(temp[4]);
	    
	    int temp1=Integer.parseInt(temp[5]);
	   volume.add(temp1);
	   
	  
	  
		
	
      }    
		
		
		for (int i=7;i<=count1-2;i++)
		{
		String[] temp= aold.get(i).split(",");
		
		highold=temp[2];
		higholdvalue=Float.parseFloat(highold);
	//	System.out.println("The old high value is "+higholdvalue);
	    lowold=temp[3];
	    lowoldvalue=Float.parseFloat(lowold);
	  //  System.out.println("The old low value is "+lowoldvalue);
	    closeold=temp[1];
	    closeoldvalue=Float.parseFloat(closeold);
	    openold=temp[4];
	    openoldvalue=Float.parseFloat(openold);
	    
	    int temp1=Integer.parseInt(temp[5]);
	  
	   
	  
	  
		
	
      }    
		
		for (int k=0;k<=close.size()-1;k++)
		{
		
		if (higholdvalue <=Float.parseFloat((String) close.get(k)))
		{
			double l=0;
			l=k/60;
			System.out.println("Breaking high "+fostock.get(z)+l);
			BHstock.add(fostock.get(z));
			break;
		}
		
		}
		
		
		for (int k=0;k<=close.size()-1;k++)
		{
		
		if (lowoldvalue>=Float.parseFloat((String) close.get(k)))
		{
		
			double l=0;
			l=k/60;
			System.out.println("Breaking low "+fostock.get(z)+l);
			BLstock.add(fostock.get(z));
			break;
		}
		
		}
		
		
		
		
	//	System.out.println("Stocks which have broken low");
		
		for (int i1=0;i1<BLstock.size()-1;i1++)
		{
			System.out.println(BLstock.get(i1));
		}
		
	/*	
      System.out.println("Stocks which have broken high");
		
		for (int j1=0;j1<BHstock.size()-1;j1++)
		{
			System.out.println(BHstock.get(j1));
		}
	*/	
		/*   Collections.reverse(high);
		   System.out.println("everyhting ok");
		   System.out.println(" The high price "+ high.get(0));
		   Collections.sort(low);
		   System.out.println(" The low price "+ low.get(0));
		   System.out.println(" The open price "+ open.get(0));
		   System.out.println(" The close price "+ close.get(close.size()-1));
		   System.out.println("the size of volume is "+volume.size());
		   System.out.println("the size of volume is "+high.size());
		   System.out.println("the size of volume is "+close.size());
		   System.out.println("the size of volume is "+open.size());
		   int diff=count-start1;
		   System.out.println("the total count"+diff);
		   System.out.println(" the last price is "+close.get(diff-1));
		 //  System.out.println(sum);
		   */
		   
		   
	}		   
		 
}
}