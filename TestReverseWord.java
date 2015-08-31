package edu.wbqa.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import edu.wbqa.strings.*;

public class TestReverseWord {

	
	@Test
	public void testPalindrome(){
		
		String s="hello world";
		String actual=ReverseWord.reverseWordByWord(s);
		String expected=" olleh dlrow";
		Assert.assertEquals(actual, expected);
	}
}
