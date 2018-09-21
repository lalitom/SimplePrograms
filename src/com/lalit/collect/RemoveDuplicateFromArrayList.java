package com.lalit.collect;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ArrayList;

public class RemoveDuplicateFromArrayList {
	

	public static void main(String[] args) {
		List<String> arrlist=new ArrayList<String>();
		arrlist.add("Java");
		arrlist.add("Robust");
		arrlist.add("Platfrom Independent");
		arrlist.add("simple");
		arrlist.add("object oriented");
		arrlist.add("Secured");
		arrlist.add("Portable");
		arrlist.add("Architecture Neutral");
		arrlist.add("Interpreted");
		arrlist.add("high Performance");
		arrlist.add("MultiThreaded");
		arrlist.add("Distributed");
		arrlist.add("Dynamic");
		arrlist.add("Portable");
		arrlist.add("Architecture Neutral");
		arrlist.add("Interpreted");
		arrlist.add("high Performance");
		
		System.out.println("the contents of ArrayList"+arrlist);
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
		lhs.addAll(arrlist);
		System.out.println("the contents of LinkedHashSet"+lhs);
		arrlist.clear();
		arrlist.addAll(lhs);
		System.out.println("the contents of ArrayList"+arrlist);

	}

}
