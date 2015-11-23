package com.innovapath.programs.Arrays;

public class LinearSearch {

	public static void main(String[] args) {
		int a[]={3,5,10,38,27,19,52,67};
		int n=38;
		for(int i=0;i<a.length;i++)
		{
			if(n==a[i])
			{
				System.out.println("Number " + n + " found in position " + (i+1));
			}

		}
		
	}
	
}
