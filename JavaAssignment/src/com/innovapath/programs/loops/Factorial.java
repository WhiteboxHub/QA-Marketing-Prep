package com.innovapath.programs.loops;

public class Factorial {

	public static void main(String[] args) {
		int n=5;
		int mul=1;
		for(int i=n;i>0;i--)
		{
			mul=mul*i;
		}
		System.out.println(mul);
		
	}

}
