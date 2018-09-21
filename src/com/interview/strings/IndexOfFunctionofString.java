package com.interview.strings;

public class IndexOfFunctionofString {

	public static void main(String[] args) {
		String str="Amazon web services are widely used accross the world";
		int index=str.indexOf("web",3);
		System.out.println(index);
		

for (int i=0;i<str.length();i++)
{
	
	str=str.substring(i);
	System.out.println(str);
	
}
		
	}

}
