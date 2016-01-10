package com.innovapath.programs.arrays;

public class LargestNumber {

	public static void main(String[] args) {
		int a[]={10,99,30,40,50};
		int max=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max){
				max=a[i];
				
			}
				
		}
		System.out.println(max);
	}

}
