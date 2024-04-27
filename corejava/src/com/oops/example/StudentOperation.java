package com.oops.example;

import java.util.Scanner;

public class StudentOperation {
	private int id;
	private String name;
	private String city;
	private String dept;
	private float per;
	Scanner s1=new Scanner(System.in);
	Student a1=new Student();
	public void setStudentDetails()
	{
		System.out.println("Eter Student id");
		id=s1.nextInt();
		System.out.println("Eter Student name");
		name=s1.next();	
		System.out.println("Eter Student city");
		city=s1.next();	
		System.out.println("Eter Student dept");
		dept=s1.next();
		System.out.println("Eter Student per");
		per=s1.nextFloat();
		a1.setId(id);
		a1.setName(name);
		a1.setCity(city);
		a1.setDept(dept);
		a1.setPer(per);
	}

	public void getStudentDetails()
	{
		System.out.println("Student id is: "+a1.getId());

		System.out.println("Student name is: "+a1.getName());
		System.out.println("Student city is: "+a1.getCity());
		System.out.println("Student dept is: "+a1.getDept());
		System.out.println("Student salary is: "+a1.getPer());
	}
}
