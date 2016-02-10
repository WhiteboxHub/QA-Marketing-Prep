package com.ipath.progpractice;

import java.util.Scanner;

public class GetInputAndPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
		      int a;
		      float b;
		      String s;
		 
		      Scanner in = new Scanner(System.in);
		 
		      System.out.println("Enter a string");
		      s = in.nextLine();
		      System.out.println("You entered string "+s);
		 
		      System.out.println("Enter an integer");
		      a = in.nextInt();
		      System.out.println("You entered integer "+a);
		 
		      System.out.println("Enter a float");
		      b = in.nextFloat();
		      System.out.println("You entered float "+b);   
		   }
	}

}
