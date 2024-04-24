package com.example.demo;

public class Student {
	

	public Student() {
	System.out.println("This is constructor");
	}
	static{
		System.out.println("This is static block 1");	
	}
	{
		System.out.println("This is non-static block");	
	}
	static void data()
	{
		System.out.println("Thi is data method");
	}
	 void demo()
	{
		System.out.println("This  is demo method");
	}

}
