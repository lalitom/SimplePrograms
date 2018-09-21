package com.interview.strings;

public class AmazonInterviewString {

	public static void main(String[] args) {
		String str="Amazon_w_e_b_services are___widely__used_acc__ro___ss_the_worl_d";String inter="";
		String finalstr="Amazon web services are widely used accross the world";
		System.out.println(str);
		String[] str1=str.split("_");
		int length=str1.length;
		for(int i=0;i<length;i++)
		{
		System.out.println(str1[i]);
		if(!str1[i].isEmpty())
		inter=inter+str1[i];
		
		}
		//System.out.println(inter);
		String[] finalstrarray=finalstr.split(" ");
		int k=0;
		for(int j=0;j<finalstrarray.length-1;j++)
		{
			System.out.println(finalstrarray[j]);
			int pos=k;
			 System.out.println("K="+k+"POS before index "+pos+"j"+j);
			 System.out.println(inter.indexOf(finalstrarray[j],0)+"j= "+j);
			 System.out.println(finalstrarray[j].length()+"j= "+j);
		 pos=inter.indexOf(finalstrarray[j],0)+finalstrarray[j].length();
		
		 k=k+pos;
		 System.out.println("K="+k+"POS after index "+pos+"j"+j);
		 
		 inter=inter.substring(0, pos)+" "+inter.substring(pos, pos+1)+inter.substring(pos+1,inter.length());
		System.out.println(inter);
	
		}
		
	}

}
