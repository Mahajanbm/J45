package com.oops.example;

import java.util.Scanner;

public class TeacherOperation {
	private int id;
	private String name;
	private String city;
	private String dept;
	private float salary;
	Scanner s1=new Scanner(System.in);
	Teacher a1=new Teacher();
	public void setTeacherDetails()
	{
		System.out.println("Eter Teacher id");
		id=s1.nextInt();
		System.out.println("Eter Teacher name");
		name=s1.next();	
		System.out.println("Eter Teacher city");
		city=s1.next();	
		System.out.println("Eter Teacher dept");
		dept=s1.next();
		System.out.println("Eter Teacher salary");
		salary=s1.nextFloat();
		a1.setId(id);
		a1.setName(name);
		a1.setCity(city);
		a1.setDept(dept);
		a1.setSalary(salary);
	}

	public void getTeacherDetails()
	{
		System.out.println("Teacher id is: "+a1.getId());

		System.out.println("Teacher name is: "+a1.getName());
		System.out.println("Teacher city is: "+a1.getCity());
		System.out.println("Teacher dept is: "+a1.getDept());
		System.out.println("Teacher salary is: "+a1.getSalary());
	}
}
