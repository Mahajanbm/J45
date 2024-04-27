package com.oops.example;

import java.util.Scanner;

public class AdminOperation {

	private int id;
	private String name;
	private String city;
	private String dept;
	private float salary;
	Scanner s1=new Scanner(System.in);
	Admin a1=new Admin();
	public void setAdminDetails()
	{
		System.out.println("Eter Admin id");
		id=s1.nextInt();
		System.out.println("Eter Admin name");
		name=s1.next();	
		System.out.println("Eter Admin city");
		city=s1.next();	
		System.out.println("Eter Admin dept");
		dept=s1.next();
		System.out.println("Eter Admin salary");
		salary=s1.nextFloat();
		a1.setId(id);
		a1.setName(name);
		a1.setCity(city);
		a1.setDept(dept);
		a1.setSalary(salary);
	}

	public void getAdminDetails()
	{
		System.out.println("Admin id is: "+a1.getId());

		System.out.println("Admin name is: "+a1.getName());
		System.out.println("Admin city is: "+a1.getCity());
		System.out.println("Admin dept is: "+a1.getDept());
		System.out.println("Admin salary is: "+a1.getSalary());
	}
}
