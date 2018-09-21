package com.interview.strings;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class findPermutationsTest {

	@Before
	public void setUp() throws Exception {
		findPermutations fp=new findPermutations();
	}

	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void VerifyingStringwithSingleCharacterasInput() {
		Set <String> testset=findPermutations.findallpermutations("A");
	   assertEquals(true, testset.contains("A"));
		
	}
	@Test
	public void VerifyingStringwithSingleCharacterasInputToSet() {
		Set <String> testset=findPermutations.findallpermutations("A");
		Set<String> expected=new HashSet<String>();
		expected.add("A");
	   assertEquals(expected, testset);
		
	}
	@Test
	public void VerifyinginsertCharacter() {
		String str="Lalit";
		char ch='d';
		int lessthanstrlength=str.length()-3;
		String returnstring=findPermutations.charInsert(str, ch, lessthanstrlength);
		assertEquals("Ladlit",returnstring);
		
		
	}
	

}
