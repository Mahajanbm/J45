package com.interfacedemo.example.demo;

public  interface Parent {


	void display();

	default	void data()
	{
		System.out.println("This data method");

	}

	static	void demo()
	{

	}



}
