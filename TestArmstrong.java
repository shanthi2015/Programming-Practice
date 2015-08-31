package edu.wbqa.testloops;

import org.testng.Assert;
import org.testng.annotations.Test;

import edu.wbqa.loops.*;

public class TestArmstrong {
	
	@Test
	public void testPositiveNumbers()
	{
			int arr = 371;
			boolean actual = Armstrong.isArmstrong(arr);
			Assert.assertEquals(actual,true);
	}

}
