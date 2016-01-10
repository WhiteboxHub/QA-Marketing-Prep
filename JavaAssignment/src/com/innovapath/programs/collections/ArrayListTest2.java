package com.innovapath.programs.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ArrayListTest2 {

	public static void main(String[] args) {
		String[] elements={"one","two","three","four","five","two"};
		Set<String> st=new HashSet<String>();
		
		for(String element:elements )
		{
			if(!(st.add(element)))
			{
				System.out.println(element);
			}
		}
			
				
	}

}
