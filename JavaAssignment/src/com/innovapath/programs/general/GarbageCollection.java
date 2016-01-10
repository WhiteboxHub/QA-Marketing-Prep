package com.innovapath.programs.general;

public class GarbageCollection {

	public static void main(String[] args) {

		Immutable immObject = new Immutable();
		System.out.println("Before garbage collection");
		immObject=null;
		Runtime rs =  Runtime.getRuntime();
		rs.gc();
		System.out.println("After garbage collection");
		
		
	}

}
