package com.innovapath.programs.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest7 {

	public static void main(String[] args) {
		ArrayList<String> alist=new ArrayList<String>();
		alist.add("Amit");
		alist.add("Ajith");
		alist.add("Ajay");
		alist.add("Arun");
		System.out.println("Actual arraylist" +alist);
		Object[] strArr =  alist.toArray();
		
        System.out.println("Created Array content:");
        for(Object str:strArr){
            System.out.println(str);
		
		
		
		

	}
	}
}
