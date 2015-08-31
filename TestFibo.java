package edu.wbqa.testloops;

import org.testng.Assert;
import org.testng.annotations.Test;

import edu.wbqa.loops.Fibonacci;

public class TestFibo {
	
	@Test
	public void testPositiveNumbers()
	{
			int arr = 2;
			int actual = Fibonacci.fib(arr);
			Assert.assertEquals(actual,2);
	}
}
