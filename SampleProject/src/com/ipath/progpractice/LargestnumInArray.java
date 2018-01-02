package com.ipath.progpractice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LargestnumInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrayofNum = { 23, 65, 99, 73, 62, 43 };
		int[] arrayofNum1 = { 298, 605, 299, 7530, 162, 463,1099 };
		int largest = 0;

		// int temp;

		for (int i = 0; i < arrayofNum1.length-1; i++) {
			if (arrayofNum1[i] > largest) {
				// temp = arrayofNum[i];
				largest = arrayofNum1[i];
				// System.out.println(temp);
			}
		}
		System.out.println("Largest number in given array is" + largest);
	}

}
