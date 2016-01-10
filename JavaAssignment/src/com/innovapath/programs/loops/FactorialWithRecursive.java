package com.innovapath.programs.loops;

public class FactorialWithRecursive {

	public static int getFactorial(int a)
	{
		if (a ==0)
			return 1;
		else
		return (a * getFactorial(a-1));
	}
	public static void main(String[] args) {
		System.out.println(getFactorial(4));

	}

}
