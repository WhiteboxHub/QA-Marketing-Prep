package com.innovapath.programs.loops;

public class Prime {

	public static void main(String[] args) {
		int n=123;
		boolean flag=true;
		for(int i=2;i<=n;i++)
		{
			if(i%2==0)
			{
				flag=false;
				break;
			}
		}if(flag==true)
		{
			System.out.println("This is a Prime number");
		}else
		{
			System.out.println("This is not a Prime Number");
		}

	}

}
