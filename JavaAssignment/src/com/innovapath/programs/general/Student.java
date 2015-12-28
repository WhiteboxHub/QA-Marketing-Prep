package com.innovapath.programs.general;

public class Student {
	int rollno;
	String name;

	Student(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}

	static void print() {
		System.out.println("This is static method");
	}

	static {
		System.out.println("This is static block");
	}
	{
		System.out.println("This is normal block");
	}

	void display() {
		System.out.println("RollNo is " + rollno + " and Name is " + name);
	}

	public static void main(String[] args) {

		Student student1 = new Student(1, "Ajay");
		student1.display();
		Student student2 = new Student(2, "Vishnu");
		student2.display();
		Student.print();

	}

}
