package edu.wbqa.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import edu.wbqa.arrays.*;

public class TestMissing {
	
	@Test
	public void testmissing1(){
		int [] arr= {1,2,3,4,5,6,8,9,10};
		int expected=7;
		int actual=ArrMissing.findMissingNumber(arr);
	    Assert.assertEquals(actual, expected);
			
	}
	
}
