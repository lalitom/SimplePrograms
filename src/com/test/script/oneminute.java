package com.test.script;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

class oneminute
{
	String  interval;
	String period;
	String ticker;
	String exchange;
	List high= new ArrayList();
	List low=new ArrayList();
	List open= new ArrayList();
	List close=new ArrayList();
	List<Integer> volume=new ArrayList();
	List date= new ArrayList();
	int count=0;
	int countdaily=0;
	
	
	public ArrayList<String> getdata(String interval,String period,String ticker) throws IOException
	{
		URL url = new URL("https://www.google.com/finance/getprices?f=d%2Cc%2Ch%2Cl%2Co%2Cv&i="+interval+"&p="+period+"d&q="+ticker+"&x=NSE");
		InputStream is = url.openConnection().getInputStream();
		BufferedReader reader = new BufferedReader( new InputStreamReader( is )  );
	       ArrayList<String> a=new ArrayList<String>();
			String line = null;
			//int count=0;
			while( ( line = reader.readLine() ) != null )  {
			   a.add(line);  // single line from csv is being dumped
			   count++;  // counts number of line in csv.

			     
			}
			reader.close();
			System.out.println("countofline"+count);
			return a;
			

	}
	
	
	
	
	
	
	
	
	void adddata(int count,List<String>a)
	{
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
		
		
   }
	
	

	void dailytrendwithopen()
	{
		
		float lastprice=Float.parseFloat((String) close.get(close.size()-1));
		if(Float.parseFloat((String) open.get(0))<=lastprice)
		{
			System.out.println("trend is positive");
		}
		else
		{
			System.out.println("trend is negative");
		}
		
	}
	
	void RSI()
	
	{
		
	}
	void EMAminutes(int periodlow ,int periodhigh)
	{
		
		
		
		
	}
	void EMAdays()
	{
		
	}
	
}


