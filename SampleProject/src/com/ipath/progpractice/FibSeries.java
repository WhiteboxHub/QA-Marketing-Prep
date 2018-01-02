package com.ipath.progpractice;

import java.util.Scanner;

public class FibSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out
				.println("Enter the number upto which you want to print the fibonacci series");
		Scanner fs = new Scanner(System.in);
		int num = fs.nextInt();
		System.out.println("we want to print fibonacci series up to " + num);
		int firstNum = 0;
		int secondNum = 1;
		System.out.print(firstNum);
		System.out.print(secondNum);
		for (int i = 1; i <= num; i++) {

			int sum = firstNum + secondNum;
			System.out.print("," + sum);
			firstNum = secondNum;
			secondNum = sum;

			// a = ;
		}

	}
}
