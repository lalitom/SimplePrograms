package com.interview.strings;

import java.util.HashSet;
import java.util.Set;

class findPermutations
{
public static Set<String> findallpermutations(String str)
{
Set<String> perm=new HashSet<String>();
if(str==null)
{
return null;
}
if(str.length()==0)
{ 
perm.add("");
return perm;
}
char initial=str.charAt(0);
String Rem=str.substring(1);
Set<String> words=findallpermutations(Rem);// str=Lalit  rem=alit intial=a rem=lit intial =l,
for(String strNew:words)
{
for(int i=0;i<=strNew.length();i++)
{
perm.add((charInsert(strNew,initial,i)));
}
}
return perm;
}// end of findallpermuations

public static String charInsert(String str,char c,int j)
{
String begin=str.substring(0,j);
String end=str.substring(j);
return begin+c+end;

}//end of charInsert

public static void main (String args[] )
{
String s = "AAC";
        //String s1 = "ABC";
        //String s2 = "ABCD";
        System.out.println("\nPermutations for " + s + " are: \n" + findallpermutations(s));
        //System.out.println("\nPermutations for " + s1 + " are: \n" + findallpermutations(s1));
        //System.out.println("\nPermutations for " + s2 + " are: \n" + findallpermutations(s2));
}// end of main
}//end of class



