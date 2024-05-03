package com.constructor.demode;

public class Test {

	public Test() {
		System.out.println("This is default constructor in java");

	}
	public Test(int x) {

		System.out.println("This is parameterized constructor in java");
	}
	public Test(String x) {

		System.out.println("This is parameterized  STring constructor in java");
	}
	public static void main(String[] args) {
		Test t1=new Test("Pune");
	}

}
