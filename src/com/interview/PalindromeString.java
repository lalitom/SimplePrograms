package com.interview;

public class PalindromeString {

	public static void main(String args[])
	{
		
		String str="NITATIN";
		int length=str.length();
		
		if (length%2!=0)
		{
			
			int middle=length/2;
			int middleloop=middle;
			//System.out.println("Char at index "+middle+""+str.charAt(middle));
			for(int i=0;i<middleloop;i++)
			{    
				
				if((str.charAt(i+middle+1))==(str.charAt(middle-1-i)))
				{
					System.out.println(str.charAt(i+middle+1));
					System.out.println(str.charAt(middle-1-i));
					
					if (i==middle-1)
					{
					System.out.println("The String is palindrome"+i);
					
					}
				}
			}
			
				
				
				
				
				
				
			}
		else{
			int middle =length/2;
			int middleforloop=middle;
			
			for (int i=0;i<middleforloop;i++)
			{
				
				if((str.charAt(middle+i))==str.charAt(middle-1-i))
				{
					
					System.out.println(str.charAt(i+middle));
					System.out.println(str.charAt(middle-1-i));
					
					
					
				}
				if (i==middle-1)
				{
				System.out.println("The String is palindrome"+i);
				
				}
			
			
			}
			
			
			
			
			
		    }
			
			
		}
		
		
		
		
	}
	
	
	

