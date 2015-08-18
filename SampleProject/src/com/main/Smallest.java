package com.main;

/**
 * This class contains the functions to find smallest number in a given array of integers.
 * @author WhiteboxQa
 *
 */
public class Smallest {

	public static int findSmallest(int[] arr)
	{
		int min = arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(min > arr[i])
			{
				min = arr[i];
			}
		}
		
		return min;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,34,56,78,90};
		int minimum = findSmallest(arr);
		System.out.println("The smallest number in array is " + minimum);
	}

}
