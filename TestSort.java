package edu.wbqa.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import edu.wbqa.arrays.*;

public class TestSort {
	
	@Test
	public void testSort(){
		int[] arr = {4,2,8,6,10};
		int[] actual = ArrSort.sortArray(arr);
		int[] expected={2,4,6,8,10};
		Assert.assertEquals(actual,expected);
	}
	
	@Test
	public void testSortNegative(){
		int[] arr = {-4,-2,8,6,10};
		int[] actual = ArrSort.sortArray(arr);
		int[] expected={-4,-2,6,8,10};
		Assert.assertEquals(actual,expected);
	}

}
