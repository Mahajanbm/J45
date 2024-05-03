package com.constructor.example;

public class Child extends Parent {
	static {
		System.out.println("This is static block of Child class");
	}
	{
		System.out.println("This is non-static block in Child class");
	}


}
