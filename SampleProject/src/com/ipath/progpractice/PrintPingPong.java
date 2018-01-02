package com.ipath.progpractice;

import java.util.Scanner;

public class PrintPingPong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter any number");
		Scanner kb = new Scanner(System.in);
		int num = kb.nextInt();

		if (num % 3 == 0 && num % 5 == 0) {
			System.out.println("ping Pong");
		} else if (num % 5 == 0 || num % 3 == 0) {
			if (num % 5 == 0) {
				System.out.println("Pong ");
			} else if (num % 3 == 0) {
				System.out.println("Ping ");
			}
		} else {
			System.out.println(num);
		}
	}
}
