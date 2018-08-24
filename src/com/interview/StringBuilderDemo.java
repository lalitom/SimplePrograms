package com.interview;

import java.lang.*;

public class StringBuilderDemo {

   public static void main(String[] args) {
  
      StringBuilder str = new StringBuilder("india");
      System.out.println("string = " + str);

      // reverse characters of the StringBuilder and prints it
      System.out.println("reverse = " + str.reverse());
  
      // reverse is equivalent to the actual
      str = new StringBuilder("malayalam");
      System.out.println("string = " + str);
	
      // reverse characters of the StringBuilder and prints it
      System.out.println("reverse = " + str.reverse());
      
      StringBuffer str1 = new StringBuffer("india");
      str1.reverse();
      System.out.println("String is reversed = "+ str1);
      
   }
}