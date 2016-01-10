package com.innovapath.programs.oops;

 class MethodOverLoad {

	void add(int a, int b) {
		System.out
				.println(("The Sum Of Two Numbers is: " + (a + b) + " In The Base Class"));
	}

	void add(int a, int b, int c) {
		System.out
				.println(("The Sum Of Three Numbers is: " + (a + b + c) + " In The Base Class"));
	}
}

class MethodOverride extends MethodOverLoad {
	void add(int a, int b) {
		super.add(3, 3);
		System.out
				.println(("The Sum Of Two Numbers is: " + (a + b) + " In The Derived Class"));
	}

	void add(int a, int b, int c) {
		super.add(2, 3, 4);
		System.out
				.println(("The Sum Of Three Numbers is: " + (a + b + c) + " In The Derived Class"));
	}
}
public class Polymorphism{
	public static void main(String[] args) {
		
		MethodOverLoad m=new MethodOverride();
		m.add(5, 10);
		m.add(2, 4, 6);
		
		
		
	}
	
}
