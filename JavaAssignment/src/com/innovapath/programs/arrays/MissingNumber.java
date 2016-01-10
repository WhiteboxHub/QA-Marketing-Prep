package com.innovapath.programs.arrays;

public class MissingNumber {

	public static void main(String[] args) {
		int a[]={1,2,3,4,5,6,7,8,10};
		int sum=0,n=10;
		int missingNumber;
		for(int i=0;i<a.length;i++)
		{
		sum=sum+a[i];	
		}
		missingNumber= (n*(n+1)/2)-sum;
		if(missingNumber>0){
		System.out.println("Missing Number is " + missingNumber);
		}
		else{
			System.out.println("No number missing from series");
		}

	}

}
