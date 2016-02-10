package com.ipath.progpractice;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter a positive number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		

		while (num > 0) {
			boolean isPrime = true;
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					isPrime = false;
					// System.out.println("The number you have entered "+ num +
					// "is not prime number");
					break;
				}
			}

			if (isPrime ) {
				System.out.println("The number you have entered " + num
						+ "is a prime number");
				break;
			} else {
				System.out.println("The number you have entered " + num
						+ "is not a prime number");
				break;
			}
		}

	}
}