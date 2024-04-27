package com.inheritance.example;

public class Test {
	public static void main(String[] args) {
		Child c1=new Child();
		c1.data();
		Child.demo();
		c1.setName("Pune");
		System.out.println(c1.getName());
	}
}
