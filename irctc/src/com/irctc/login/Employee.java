package com.irctc.login;

public class Employee {
	static int id;
	String name;
	float salary;


	public	void demo()
	{
		System.out.println(name);
		System.out.println(salary);
		System.out.println(Employee.id);
	}
	public static void main(String[] args) {
		Employee e1=new Employee();
		System.out.println(Employee.id);
		System.out.println(e1.name);
		System.out.println(e1.salary);

	}
}
