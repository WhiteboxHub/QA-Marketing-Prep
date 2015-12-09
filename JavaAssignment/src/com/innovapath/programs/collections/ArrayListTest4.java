package com.innovapath.programs.collections;

import java.util.Collection;
import java.util.HashMap;

public class ArrayListTest4 {
	HashMap<Integer, String> hm = new HashMap<Integer, String>();

	public void addElements() {

		hm.put(100, "Amit");
		hm.put(101, "Ajit");
		hm.put(102, "Arvind");
		hm.put(103, "Arul");
		hm.put(104, "Ajay");
	}

	public Boolean searchKey(int key) {
		

		System.out.println("Searching  for " +key + " key in the map");
		System.out.println("The value of the key is:"+hm.get(102));
		return hm.containsKey(key);
		
	}

	public static void main(String[] args) {
		ArrayListTest4 al = new ArrayListTest4();
		al.addElements();
		al.searchKey(102);
		

	}

}
