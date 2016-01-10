package com.innovapath.programs.oops;

public class Circle extends Shape implements ShapeConstants{
	double radius;
	 Circle(double radius)
	{
		this.radius=radius;
	}
	double calculateArea(){
		
		return ShapeConstants.pi*(radius*radius);
	}
	
	double calculatePerimeter(){
		return 2*(ShapeConstants.pi*radius);
		
	}
	void setSides(int sides){
		noOfSides=sides;
		
	}

	public static void main(String[] args) {
		Shape s=new Circle(4);
		s.setSides(3);
		
		
	}
	

}
