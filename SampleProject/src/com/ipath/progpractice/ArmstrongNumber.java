package com.ipath.progpractice;
import java.util.Scanner;
public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter a positive number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0 ,ArmstrongNum =num;

		while (num > 0) {
			int a = num % 10;
			sum = sum + (a * a * a);
			num = num / 10;
		}
		System.out.println(sum);
		if ( ArmstrongNum==sum) {
			System.out.println("The number is an armstron number");
		} else {
			System.out.println("The number is not an armstron number");
		}

	}

}
