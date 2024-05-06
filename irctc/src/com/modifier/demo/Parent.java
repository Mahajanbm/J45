package com.modifier.demo;


public class Parent {
	int id;

	public Parent() {
		
	}
	void demo()
	{
		System.out.println(id);
		System.out.println("Demo method");
	}
	public static void main(String[] args) {
		Parent p1=new Parent();
		System.out.println(p1.id);
		p1.demo();
	}
}
