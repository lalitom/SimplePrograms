package com.interview;

public class RemoveSecondStringCharFromFirstString {

	public static void main(String[] args) {
     String First="Laa, lit",Second="Kumar, ";	
   // static int length=First.length();
     RemoveSecondStringCharFromFirstStringMethod(First, Second);
	}
	
	public static void RemoveSecondStringCharFromFirstStringMethod(String First,String Second)
	{   
		
		
		for (int i=0;i<First.length();i++)
		{
			
			for (int j=0;j<Second.length();j++)
			{
				if(First.substring(i,i+1).equals(Second.substring(j, j+1)))
						{
					
					int length=First.length();
					First=First.substring(0,i)+First.substring(i+1,First.length());
					int newlength =First.length();
					i=i-(length-newlength);
					
					System.out.println("First in loop in iteration i="+i+"j="+j+First);
					
					
						}
				
			}
			
		}
		
		System.out.println("The working with "+First);
	}
	
	

}
