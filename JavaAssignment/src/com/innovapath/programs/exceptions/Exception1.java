package com.innovapath.programs.exceptions;

public class Exception1 {

	public static void main(String[] args) {
		String s=null;
		try
		{
			System.out.println(s.length());
		}catch(NullPointerException e)
		{
			System.out.println("Exception catched in catch block : " + e.getMessage());
		}
		finally
		{
			System.out.println("This is Finally Block");
		}
	}

}
