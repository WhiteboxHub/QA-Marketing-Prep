package com.innovapath.programs.loops;

public class Amstrong {

	public static void main(String[] args) {
		int r,n=153;
		int sum=0;
		int temp=n;
		while(n>0){
			r=n%10;
			sum=sum+(r*r*r);
			n=n/10;
		}if(temp==sum){
			System.out.println("This is a amstrong number");
		}else
		{
			System.out.println("This is not a amstrong number");
		}
	}

}
