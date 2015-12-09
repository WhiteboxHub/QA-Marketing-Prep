package com.innovapath.programs.oops;

public  abstract class Shape {
	int  noOfSides;
	double area;
	double perimeter;
	abstract double calculateArea();
	abstract double calculatePerimeter();
	abstract void setSides(int sides);
	

}
