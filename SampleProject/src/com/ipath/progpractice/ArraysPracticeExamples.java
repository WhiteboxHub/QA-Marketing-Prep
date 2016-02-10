package com.ipath.progpractice;

//import java.awt.List;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ArraysPracticeExamples {

	static int[] arrayofNum = { 10, 9, 3, 6, 4, 7, 8, 1, 2 };
	static int[] arrayofNum1 = { 298, 605, 299, 7530, 162, 463, 1099 };
	static int[] arrayofNum2 = { 6, 5, 23, 2, 1, 6, 3, 1, 8, 12, 3 };

	// Arrays.sort(arrayofNum2);

	
	//Method to find missing number
	static void findMissingNum() {
		int length = arrayofNum.length;

		int indexes = 10;
		int values = 0;

		for (int i = 0; i < length; i++) {
			indexes += i + 1;
			values += arrayofNum[i];
			// values = values+ arrayofNum[i];
		}

		int result = indexes - values;

		System.out.println("Missing number is: " + result);
	}

	
	//Method to find duplicate number in same array
	static void duplicateNum() {
		Arrays.sort(arrayofNum2);
		for (int i = 1; i < arrayofNum2.length; i++) {
			if (arrayofNum2[i] == arrayofNum2[i - 1]) {
				System.out.println("Duplicate found: " + arrayofNum2[i]);
			}
		}
	}

	
	//method to find common numbers from two arrays
	
	static void printCommonNum() {

		Set<Integer> numSet = new TreeSet<Integer>();

		for (int i = 0; i < arrayofNum.length; i++) {

			for (int k = 0; k < arrayofNum2.length; k++) {

				if (arrayofNum[i] == arrayofNum2[k]) {

					numSet.add(arrayofNum[i]);
				}

			}

		}

		for (int s : numSet) {
			System.out.println(s + "");
		}
	}

	static void printDuplicates() {

		int[] arr1 = { 4, 7, 3, 9, 2 };
		int[] arr2 = { 3, 2, 12, 9, 40, 32, 4 };
		List list1 = Arrays.asList(arr1);
		List list2 = Arrays.asList(arr2);
		// list1.retainAll(list2);
		System.out.println("CommonElements : " + list1);
	}

	
	// merge two arrays of integer numbers
	static void mergeAndPrint() {

		int[] combineArray = new int[arrayofNum.length + arrayofNum1.length];
		int i;
		for (i = 0; i < arrayofNum.length; i++) {
			combineArray[i] = arrayofNum[i];

			for (int j = 0; j < arrayofNum1.length; j++) 
				combineArray[i++] = arrayofNum1[j];
			
		
		for (int k = 0; k < combineArray.length; k++)
			System.out.print(combineArray[k] + " ");
	}
	}
	static void linearSeacrh() {
	}

	
	// method to sort the elements of an array yet to finish with another logic
	static void sortArray() {

		Arrays.sort(arrayofNum1);
		for (int i = 0; i < arrayofNum1.length; i++) {
			System.out.print("," + arrayofNum1[i]);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArraysPracticeExamples exp1 = new ArraysPracticeExamples();
		// exp1.sortArray();
		// exp1.duplicateNum();
		// exp1.findMissingNum();
		// exp1.printCommonNum();
		//exp1.printDuplicates();
		exp1.mergeAndPrint();
	}

}
