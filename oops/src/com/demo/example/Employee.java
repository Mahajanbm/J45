package com.demo.example;

public abstract class Employee {

	private Employee() {
		System.out.println("This is Employee Default");
	}
	public Employee(int x)
	{
		System.out.println("This is parameterized constructor");

	}

}
