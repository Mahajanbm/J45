package com.inheritance.realtime;

public class Child extends Parent {
	String name;
   void data() {
	System.out.println("Method of Child Class");
	
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
}
