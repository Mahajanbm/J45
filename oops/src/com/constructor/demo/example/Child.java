package com.constructor.demo.example;

public class Child  extends Parent{

	public Child() {
		super(100);
		System.out.println("This is Child class Default constructor");
	}
	public Child( int x) {

		this();
		// super();
		System.out.println("This is Child class parameterized constructor");

	}
}
