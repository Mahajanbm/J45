package com.constructor.demode;



public abstract class Product {

	public Product() {
		System.out.println("This is Prouduct class constructor");
	}
	abstract void data();//This is abstract method
	void demo()
	{
		System.out.println("This is non-abstarct method");
	}
}
