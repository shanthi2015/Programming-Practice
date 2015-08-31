package edu.wbqa.test;

import org.testng.Assert;
import org.testng.annotations.Test;


import edu.wbqa.strings.*;

public class TestPalindrome {
	
	@Test
	public void testPalindrome(){
		
		String s="ala";
		String actual=StringPalindrome.strPalindrome(s);
		String expected="ala";
		Assert.assertEquals(actual, expected);
	}
	

}
