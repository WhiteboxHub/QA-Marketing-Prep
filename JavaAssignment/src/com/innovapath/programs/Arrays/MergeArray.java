package com.innovapath.programs.Arrays;

public class MergeArray {

	public static void main(String[] args) {
		int a[]={2,4,6,8,10};
		int b[]={1,3,5,7,9};
	
		int c[] =new int[10];
		int index=0;
		for(int i=0;i<a.length;i++)
		{
			c[index++]=a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			c[index++]=b[i];
		}
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
		
		
	}

}
