package com.test.script;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class ReadingtheCSVBhavcopy
{
	
	
	public static void main (String args[]) throws IOException
	{
		
		
		
		
		
		
		ArrayList<Script> owners = new ArrayList<Script>();
        BufferedReader br= new BufferedReader(new FileReader("D:\\datamarket\\CM\\cm28MAR2018bhav.csv"));
        ArrayList<String> a=new ArrayList<String>();
        List doji=new ArrayList();
        List Volumemorethan50 =new ArrayList();
		String line=null;
		int count=0;
		List SYMBOL =new ArrayList();
		List<String> SERIES =new ArrayList();
		List OPEN =new ArrayList();
		List HIGH =new ArrayList();
		List LOW =new ArrayList();
		List CLOSE =new ArrayList();
		List LAST =new ArrayList();
		List PREVCLOSE =new ArrayList();
		List TOTTRDQTY =new ArrayList();
		List TOTTRDVAL =new ArrayList();
		List TIMESTAMP =new ArrayList();
		List TOTALTRADES =new ArrayList();
		while( ( line = br.readLine() ) != null )  {
		   a.add(line);  // single line from csv is being dumped
		   count++;  // counts number of line in csv.

		     
		}
		
		br.close();
		
		
		System.out.println("The count value "+count);
		
		
		for (int i=1;i<=count-1;i++)
		{
		String[] temp= a.get(i).split(",");
		
		//System.out.println(temp[0]);
		SYMBOL.add(temp[0]);
		SERIES.add(temp[1]);
		OPEN.add(temp[2]);
		HIGH.add(temp[3]);
		LOW.add(temp[4]);
		CLOSE.add(temp[5]);
		LAST.add(temp[6]);
		PREVCLOSE.add(temp[7]);
		TOTTRDQTY.add(temp[8]);
		TOTTRDVAL.add(temp[9]);
		TIMESTAMP.add(temp[10]);
		TOTALTRADES.add(temp[11]);
	

	
      } // close of for loop
		
	//System.out.println(SYMBOL.get(3));
	for (int i=0;i<=count-2;i++)
	{      //System.out.println("Hello World");
		//System.out.println(SERIES.get(i));
		
		if (SERIES.get(i).equals("EQ"))
		{     
		     float open=Float.parseFloat(OPEN.get(i).toString());
		     float close=Float.parseFloat(CLOSE.get(i).toString());
			float difference=close-open;
			//System.out.println(difference);
			float high=Float.parseFloat(HIGH.get(i).toString());
		     float low=Float.parseFloat(LOW.get(i).toString());
			float range=high-low;
			float percentage=difference/range;
			int volume=Integer.parseInt((String) TOTTRDQTY.get(i));
			float toaltradedvalue=Float.parseFloat((String) TOTTRDVAL.get(i));
			//System.out.println(percentage);
			if(Math.abs(percentage)<=0.010&& high>=10 && volume >=50000)
			{    
				System.out.println("Symbol "+SYMBOL.get(i));
				System.out.println("OPEN "+OPEN.get(i));
				System.out.println("CLOSE "+CLOSE.get(i));
				System.out.println("HIGH "+HIGH.get(i));
				System.out.println("LOW "+LOW.get(i));
				System.out.println("VOLUME "+TOTTRDQTY.get(i));
				doji.add(SYMBOL.get(i));
				
			}
			
			
			/*
			if(volume >=1000000 && high>10)
			{    
				System.out.println(SYMBOL.get(i));
				//System.out.println("OPEN "+OPEN.get(i));
				//System.out.println("CLOSE "+CLOSE.get(i));
				//System.out.println("HIGH "+HIGH.get(i));
				//System.out.println("LOW "+LOW.get(i));
				//System.out.println("VOLUME "+TOTTRDQTY.get(i));
				Volumemorethan50.add(SYMBOL.get(i));
				
			}
			
			if(toaltradedvalue >=500000000 && high>10)
			{    
				System.out.println(SYMBOL.get(i));
				//System.out.println("OPEN "+OPEN.get(i));
				//System.out.println("CLOSE "+CLOSE.get(i));
				//System.out.println("HIGH "+HIGH.get(i));
				//System.out.println("LOW "+LOW.get(i));
				//System.out.println("VOLUME "+TOTTRDQTY.get(i));
				Volumemorethan50.add(SYMBOL.get(i));
				
			}
			*/
		}
		
		
		
	}// close of for loop
		
		
		
	} // close of main 
	
	
	
	
	
	
	
}// close of class
