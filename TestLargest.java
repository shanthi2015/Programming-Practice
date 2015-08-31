package edu.wbqa.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import edu.wbqa.arrays.*;

public class TestLargest {
	@Test
	public void testmax1(){
		
		int [] arr= new int[] {100,20,30};
		int expected=100;
		int actual=ArrLargest.findmax(arr);
	    Assert.assertEquals(actual, expected);
		
	}
	
	@Test
	public void testDuplicateNumbers()
	{
		
		int[] arr = {2,3,45,34,45};
		int actual = ArrLargest.findmax(arr);
		Assert.assertEquals(actual,45);
	}
	
	@Test
	public void testPosNegNumbers()
	{
		
		int[] arr = {-2,3,45,-34,13};
		int actual = ArrLargest.findmax(arr);
		Assert.assertEquals(actual,45);
	}
	


}
