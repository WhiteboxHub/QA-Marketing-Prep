package com.innovapath.programs.file;

import java.io.BufferedReader;
import java.io.Console;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class DynamicInput {
	
	public static void scannerInputs()
	{
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter first number using scanner");
		int firstNumber=scanner.nextInt();
		System.out.println("Enter second number using scanner");
		int secondNumber=scanner.nextInt();
		System.out.println("Sum of two numbers is " + (firstNumber+secondNumber));
		scanner.close();
	}
	
	public static void bufferedReaderInputs() throws NumberFormatException, IOException
	{
		InputStreamReader reader = new InputStreamReader(System.in);
	    BufferedReader in = new BufferedReader(reader);
		System.out.println("Enter first number using bufferedreader");
		int firstNumber=Integer.parseInt(in.readLine());
		System.out.println("Enter second number using bufferedreader");
		int secondNumber=Integer.parseInt(in.readLine());
		System.out.println("Difference between two numbers is " + (firstNumber-secondNumber));
	}

	public static void dataInputStreamInputs() throws IOException
	{
		DataInputStream dataInput = new DataInputStream(System.in);
		System.out.println("Enter first number using datainputstream");
		int firstNumber=Integer.parseInt(dataInput.readLine());
		System.out.println("Enter second number using datainputstream");
		int secondNumber=Integer.parseInt(dataInput.readLine());
		System.out.println("Product of two numbers is " + (firstNumber*secondNumber));
	}
	
	//runs in commandline
	public static void consoleInputs() throws IOException
	{
		Console console=System.console(); 
		int firstNumber=Integer.parseInt(console.readLine("Enter first number using console"));
		int secondNumber=Integer.parseInt(console.readLine("Enter second number using console"));
		System.out.println("Quotient of two numbers is " + (firstNumber/secondNumber));
	}
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		DynamicInput.bufferedReaderInputs();
		DynamicInput.dataInputStreamInputs();
		DynamicInput.scannerInputs();
		DynamicInput.consoleInputs();

		
	}

}
