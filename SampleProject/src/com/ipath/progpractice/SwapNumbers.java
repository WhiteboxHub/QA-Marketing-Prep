package com.ipath.progpractice;

import java.util.Scanner;

public class SwapNumbers {
	
	
	Scanner kb = new Scanner(System.in);
	int num1 = kb.nextInt();
	int num2 = kb.nextInt();

	void swapWithoutVariable1() {
		 num1=num1+num2;
		 num2=num1-num2;
		 num1=num2-num1;
		 System.out.println("After swapping the numbers:" + num1 +"" + num2);
		 
	}
	void swapWithoutVariable2() {
		 num1=num1*num2;
		 num2=num1/num2;
		 num1=num1/num2;
		 System.out.println("After swapping the numbers:" + num1 +"" + num2);
		 
	}

	 void swapWithVariable() {
		
		int temp = num1;
		num1 = num2;		
		System.out.println("After swapping with variable ");  
		System.out.println(num1);
		System.out.println(temp);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the numbers you wish to swap");
		SwapNumbers sp = new SwapNumbers();
		//sp.swapWithoutVariable1();
		//sp.swapWithVariable();
		sp.swapWithoutVariable2();
			}

}
