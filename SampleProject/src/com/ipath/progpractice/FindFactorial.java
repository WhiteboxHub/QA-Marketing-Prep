package com.ipath.progpractice;

import java.util.Scanner;

public class FindFactorial {

	// Scanner num = new Scanner(System.in);
	// int n = num.nextInt();
	

	static int withoutRecursion(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		return fact;
	}

	static int withRecursion(int n) {
		if (n <= 0) {
			return 1;
		} else {
			int result = n * withRecursion(n - 1);
			return result;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the number ");
		Scanner num = new Scanner(System.in);
		int n = num.nextInt();
		// FindFactorial f = new FindFactorial();
		int result = FindFactorial.withRecursion(n);
		System.out.println("Factorial using recursion method:" +result);

		// findFactWithoutRecursion();
		int result1 = FindFactorial.withoutRecursion(n);
		System.out.println("Factorial without using recursion method :" +result1);
	}

}
