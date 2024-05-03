package com.demo.demo;

public class Employee {
	//method overloading
	void display()
	{
		System.out.println("Display method");
	}

	void display(int x)
	{
		System.out.println("Display method with int parameter");
	}
	void display(String str)
	{
		System.out.println("Display method with String parameter");
	}
	void display(int x,String y)
	{
		System.out.println("Int String parameter");
	}
	void display(String y,int x)
	{
		System.out.println(" String int parameter");
	}


	public static void main(String[] args) {
		Employee e1=new Employee();
		//e1.display();
		e1.display(10);

	}
}
