package com.java.oops;

public class Employee {
	int a=10;//non-static variable instance variable in java
	static  int b=50;//static variable
	void data()//instance method or non-static method
	{
		int x=90;//local varivable non-static 
		System.out.println(x);
	}
	 static void demo()
	 {
		 System.out.println("This is static method");
		 
	 }
	  public static void main(String[] args) {
		 Employee e1=new Employee();
		 System.out.println(e1.a);
		 System.out.println(Employee.b);
		 e1.data();
		 Employee.demo();
		 
		 
	}
}
