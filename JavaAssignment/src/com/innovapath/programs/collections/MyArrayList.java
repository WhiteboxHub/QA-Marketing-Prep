package com.innovapath.programs.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class MyArrayList {

	ArrayList<String> arrayList = new ArrayList<String>();

	public void addElements() {
		arrayList.add("Priya");
		arrayList.add("Geetha");
		arrayList.add("Shalu");
		arrayList.add("Lalitha");
		arrayList.add("Shanthi");
	}

	public boolean findElement(String element) {
		System.out.print("Finding " + element + " in the List");
		return arrayList.contains(element);
	}

	void printElements() {

		Iterator<String> itr = arrayList.iterator();
		System.out.println("Traversing elements using Iterator order...");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	void reverse() {
		ListIterator<String> itr = arrayList.listIterator(arrayList.size());
		System.out.println("Traversing elements in reverse order...");
		while (itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
	}

	public static void main(String[] args) {
		MyArrayList al = new MyArrayList();
		al.addElements();
		if (al.findElement("Shalu"))
		{
			System.out.println(" - Found");
		}
		else
		{
			System.out.println(" - Not Found");
		}
		al.printElements();
		al.reverse();
	}

}
