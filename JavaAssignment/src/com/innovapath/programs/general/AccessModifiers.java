package com.innovapath.programs.general;

class Employee
{
	protected int empId;
	protected String empName;
	private String managerName;
	
	public Employee(int empId,String empName,String managerName)
	{
		this.empId=empId;
		this.empName=empName;
		this.managerName=managerName;
	}
	
	public void display()
	{
		System.out.println("Employee Number is " + empId);
		System.out.println("Employee Name is " + empName);
		System.out.println("Employee Manager Name is " + managerName);
	}
}
//Assuming manager doesn't have manager
class Manager extends Employee
{
	int noOfReportingEngineers;
	
	public Manager(int empId,String empName,int noOfEnginners)
	{
		super(empId,empName,null);
		noOfReportingEngineers=noOfEnginners;
	}
	
	void printDetails()
	{
		super.display();
		System.out.println("No. Of Reporting Engineers" + noOfReportingEngineers);
	}
}

public class AccessModifiers
{
	
	public static void main(String args[])
	{
		Employee e=new Employee(4,"Vijay","Sanjay");
		e.display();
		Manager m=new Manager(5,"Ajay",4);
		m.printDetails();
		
		
	}
	
}