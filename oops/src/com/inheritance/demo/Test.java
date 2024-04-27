package com.inheritance.demo;

public class Test {
	public static void main(String[] args) {
		Parent p1=new Parent();
		p1.demo();

		Child c1=new Child();
		c1.demo();

		GrandChild g1=new GrandChild();
		g1.demo();
	}
}
