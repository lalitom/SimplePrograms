package com.test.script;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class demooneminute
{
	static List temp=null;
	public static void main (String args[]) throws IOException
	{
		temp=new ArrayList();
		oneminute om =new oneminute();
		temp=om.getdata("60", "1", "SBIN");
		om.adddata(om.count, temp);
		System.out.println(om.close.get(om.close.size()-1));
		ArrayList temp1 = new ArrayList();
		day oneday=new day();
		temp1=oneday.getdatadaily("2", "SBIN");
		//System.out.println(temp1.get(7));
		oneday.adddata(oneday.count-1, temp1);
		System.out.println(oneday.low.get(0));
		oneday.pivot((String) oneday.high.get(0),(String) oneday.low.get(0),(String) oneday.close.get(0),(String) oneday.open.get(0));
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}