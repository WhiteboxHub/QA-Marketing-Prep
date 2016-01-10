package com.innovapath.programs.general;

class SeriesPrinter
{
	public static void printSeries(int n)
	{
		if (n>10)
		{
			return;
		}
		else
		{
			System.out.println(n++);
			printSeries(n);
			}
	}
}

public class PrintSeries {

	public static void main(String[] args) {
		SeriesPrinter.printSeries(1);
	}

}
