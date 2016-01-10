package com.innovapath.programs.arrays;

public class CommonNumbersInTwoNumbers {

	public static void main(String[] args) {
		int a[]={5,10,18,34,23,12,45,43};
		int b[]={3,5,25,34,29,91,01,12};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j]){
					System.out.println(a[i]);
				}
			}
		}
	}

}
