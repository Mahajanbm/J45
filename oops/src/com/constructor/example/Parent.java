package com.constructor.example;

public class Parent {

	static
	{
		System.out.println("This is static block in PArent class");
	}

	{
		System.out.println("This is non-static block in PArent class");
	}

}
