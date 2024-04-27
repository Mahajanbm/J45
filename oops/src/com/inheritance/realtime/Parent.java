package com.inheritance.realtime;

public class Parent {
	String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	static void demo() {
		System.out.println("Static Method of Parent Class");
	}
}
