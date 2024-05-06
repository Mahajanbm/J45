package com.demo.demo.modifier;

public class Parent {
	protected int id=100;
	protected void demo()
	{
		System.out.println("This si demo method");
	}
	public static void main(String[] args) {
		Parent p1=new Parent();
		System.out.println(p1.id);
		p1.demo();
	}
}
