package com.test.script;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

class day
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
	
	
	
	
	
	public ArrayList<String> getdatadaily(String period,String ticker) throws IOException
	{
		URL url = new URL("https://www.google.com/finance/getprices?f=d%2Cc%2Ch%2Cl%2Co%2Cv&p="+period+"d&q="+ticker+"&x=NSE");
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
		for (int i=7;i<=7;i++)
		{
		String[] temp= a.get(i).split(",");
		
		//System.out.println(temp[0]);
	   float highmax;
	   float lowmin;
		//DATE,CLOSE,HIGH,LOW,OPEN,VOLUME
	// List high= new ArrayList();
	    high.add(temp[2]);
	   //System.out.println(high.get(0));
	    low.add(temp[3]);
	    close.add(temp[1]);
	    open.add(temp[4]);
	    
	    int temp1=Integer.parseInt(temp[5]);
	   volume.add(temp1);
	   
	  }    
		
		
   }
	
	void pivot (String high,String low,String close,String open)
	{
		float high1= Float.parseFloat(high);
		float low1= Float.parseFloat(low);
		float close1= Float.parseFloat(close);
		float open1= Float.parseFloat(open);
		float pp=(high1+close1+low1)/3;
		float r1=(2*pp-low1);
		float s1=(2*pp-high1);
		float r2=pp+(high1-low1);
		float s2=pp-(high1-low1);
		
		float r3=high1+2*(pp-low1);
		float s3=low1-2*(high1-pp);
		System.out.println("Resistance "+"r1= "+r1+"r2= "+r2+"r3= "+r3);
		System.out.println("support" +"s1= "+s1+"s2= "+s2+"s3= "+s3);
		
		
		
	}
	
	
}


