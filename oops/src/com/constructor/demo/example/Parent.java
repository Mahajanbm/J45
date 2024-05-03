package com.constructor.demo.example;

public class Parent {


	public Parent() {

		System.out.println("THis is default Constructor  of parent ");
	}

	public Parent( int x) {
		this();//
		System.out.println("THis is parameterized Constructor  of parent ");
	}




}
