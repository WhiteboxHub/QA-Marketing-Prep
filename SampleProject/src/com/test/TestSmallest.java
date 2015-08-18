package com.test;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.main.Smallest;

/**
 * This class contains all the test cases for testing Smallest class  
 * @author WhiteboxQa
 *
 */
public class TestSmallest {

	@Test
	public void testPositiveNumbers()
	{
		int[] arr = {2,3,45,34,13};
		int actual = Smallest.findSmallest(arr);
		Assert.assertEquals(actual,2);
	}
	
	@Test
	public void testNegativeNumbers()
	{
		int[] arr = {-2,-3,-45,-34,-13};
		int actual = Smallest.findSmallest(arr);
		Assert.assertEquals(actual,-45);
	}
	
	@Test
	public void testDuplicateNumbers()
	{
		int[] arr = {2,3,45,34,2};
		int actual = Smallest.findSmallest(arr);
		Assert.assertEquals(actual,2);
	}
	
	@Test
	public void testPosNegNumbers()
	{
		int[] arr = {-2,3,45,-34,13};
		int actual = Smallest.findSmallest(arr);
		Assert.assertEquals(actual,-34);
	}
}
