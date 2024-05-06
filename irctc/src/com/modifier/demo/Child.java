package com.modifier.demo;

public class Child  extends Parent{
	void display()
	{
		//super.id=90;
		//super.demo();
		System.out.println(id);
	//	System.out.println(super.id=90);
		demo();
	}
	 public static void main(String[] args) {
		Child c1=new Child();
		c1.display();
	}
}
