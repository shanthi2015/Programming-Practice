package edu.wbqa.testloops;

import org.testng.Assert;
import org.testng.annotations.Test;

import edu.wbqa.loops.*;

public class TestPrime {

	@Test
	public void testPositiveNumbers()
	{
			int arr = 2;
			boolean actual = PrimeNum.isPrimeNum(arr);
			Assert.assertEquals(actual,true);
	}
}
