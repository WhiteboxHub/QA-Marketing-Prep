package com.innovapath.programs.strings;

public class ReverseEachString {

	public static void main(String[] args) {
		String s="Hello World";
		StringBuffer buffer= new StringBuffer();
		String[] str=s.split(" ");
		
		for(int i=s.length()-1;i>=0;i--)
		{
			buffer.append(str[i]);
			buffer.append(" ");
				
		}
		System.out.println("Original String :" +s);
		System.out.println("Reverse Word String :" +buffer.toString());
	}

}
