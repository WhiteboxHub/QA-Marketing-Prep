package com.innovapath.programs.arrays;

public class SwapNumbersInSortedArray {

	public static void main(String[] args) {
		int a[]={5,10,25,20,15,30};
		int leftIndex=-1,rightIndex=-1;int temp;
		for(int i=a.length-1;i<a.length;i--)
		{
			if(a[i]<a[i-1])
			{
				leftIndex=i;
				break;
			}
		}
			for(int j=0;j<a.length;j++)
			{
				if(a[j]>a[j+1])
				{
					rightIndex=j;
					break;
				}
			}
			
		
		temp=a[rightIndex];
		a[rightIndex]=a[leftIndex];
		a[leftIndex]=temp;
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		
		}
      
		

}
