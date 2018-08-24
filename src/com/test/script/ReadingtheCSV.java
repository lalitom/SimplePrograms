package com.test.script;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

class ReadingtheCSV
{
	
	
	public static void main (String args[]) throws IOException
	{
		
		ArrayList<Script> owners = new ArrayList<Script>();
         BufferedReader br= new BufferedReader(new FileReader("D:\\datamarket\\23April2018.csv"));
      
		String line;
		while ((line = br.readLine()) != null) {

		    String[] entries = line.split(",");
                System.out.println(entries[2]);
		    Script owner = new Script(entries[0], entries[1], entries[2], entries[3],entries[4],entries[5],entries[6], entries[7], entries[8], entries[9],entries[10],entries[11],entries[12]);
             
		    owners.add(owner);
		}
		
		
	}
	
	
	
	
	
	
	
}
