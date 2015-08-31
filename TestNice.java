package edu.wbqa.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import edu.wbqa.strings.ThisisNice;

public class TestNice {
	
	
	@Test
	public void testnice(){
		
		String s="This is Nice";
		String actual=ThisisNice.append(s);
		String expected="This1 is2 Nice3";
		Assert.assertEquals(actual, expected);

	}
	
	

}
