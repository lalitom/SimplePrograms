package com.interview;

import java.util.ArrayList;
import java.util.List;

public class Permutationsmyway {

	public static void main(String[] args) {
		String str="Lalit";
		String original=str;
		String temp;
		String r1,r2;
		int length=str.length();
		List arraylist=new ArrayList<String>();
		arraylist.add(str);
		
	for (int i=0;i<str.length();i++)	
	{
		for(int j=0;j<i+1;j++)
		{
			r1=str.substring(length-(i+1),length);
			r2=str.substring(length-(i+2), length-(i+1));
			temp=str.substring(0, length-(i+2))+r1+r2;
			arraylist.add(temp);
			
		}
		
		
	}
		
		System.out.println(arraylist);

	}

}
