package com.test.script;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ReadingtheCSVBhavcopyFO
{
	
	
	public static void main (String args[]) throws IOException
	{
		
		ArrayList<Script> owners = new ArrayList<Script>();
        BufferedReader br= new BufferedReader(new FileReader("D:\\datamarket\\FO\\fo27MAR2018bhav.csv"));
        String line=null;
		int count=0;
        ArrayList<String> a=new ArrayList<String>();
        List INSTRUMENT=new ArrayList();
        List EXPIRY_DT =new ArrayList();
		List SYMBOL =new ArrayList();
		List OPEN =new ArrayList();
		List HIGH =new ArrayList();
		List LOW =new ArrayList();
		List CLOSE =new ArrayList();
		List OPEN_INT =new ArrayList();
		List STRIKE_PR =new ArrayList();
		List OPTION_TYP =new ArrayList();
		List SETTLE_PR =new ArrayList();
		List CONTRACTS =new ArrayList();
		List VAL_INLAKH =new ArrayList();
		List CHG_IN_OI =new ArrayList();
		List TIMESTAMP =new ArrayList();
		List<String> FUTIDX=new ArrayList();
		List FUTSTK=new ArrayList();
		List OPTIDX=new ArrayList();
		List OPTSTK=new ArrayList();
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
		INSTRUMENT.add(temp[0]);
		SYMBOL.add(temp[1]);
		EXPIRY_DT.add(temp[2]);
		STRIKE_PR.add(temp[3]);
		OPTION_TYP.add(temp[4]);
		OPEN.add(temp[5]);
		HIGH.add(temp[6]);
		LOW.add(temp[7]);
		CLOSE.add(temp[8]);
		SETTLE_PR.add(temp[9]);
		CONTRACTS.add(temp[10]);
		VAL_INLAKH.add(temp[11]);
		OPEN_INT.add(temp[12]);
		CHG_IN_OI.add(temp[13]);
		TIMESTAMP.add(temp[14]);
	

	
      } // close of for loop
		
	//System.out.println(SYMBOL.get(3));
	for (int i=0;i<=count-2;i++)
	{    
		
		if (INSTRUMENT.get(i).equals("FUTIDX")&&(SYMBOL.get(i).equals("BANKNIFTY")||SYMBOL.get(i).equals("NIFTY")))

		{     
			FUTIDX.add(a.get(i));
			
		}
		
		if (INSTRUMENT.get(i).equals("OPTIDX")&&(SYMBOL.get(i).equals("BANKNIFTY")||SYMBOL.get(i).equals("NIFTY")))

		{     
			OPTIDX.add(a.get(i));
			
		}
		
		
	}// close of for loop	
	for (int j=0;j<=FUTIDX.size()-1;j++)
	{
		//System.out.println(FUTIDX.get(j));
		
		
	}
		
	
	for (int j=0;j<=OPTIDX.size()-1;j++)
	{
		//System.out.println(OPTIDX.get(j));
		
		
	}
	
	List OPENINT= new ArrayList();
	OPENINT.addAll(OPEN_INT);
	Collections.reverse(OPENINT);
	
	for (int j=0;j<=OPENINT.size()-1;j++)
	{
		
		System.out.println("the value "+OPENINT.get(j));
		
		
	}
	
	} // close of main 
	
	// to find max open interest 
	
	
	
	
	
	
	
	
	
}// close of class
