package com.innovapath.programs.general;

final class Bank {
	final private String name;
	final private int accno;

	Bank(String name, int accno) {
		this.name = name;
		this.accno = accno;
	}

	public String getName() {
		return name;
	}

	public int getAccno() {
		return accno;
	}
}

public class Immutable {

	public static void main(String[] args) {
		Bank b = new Bank("Priya", 28474);
		System.out.println(b.getName() + " " + b.getAccno());
	}

}
