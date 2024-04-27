package com.oops.demo;

import java.util.Scanner;

public class Opeartion {

	private int id;
	private String name;
	private String dept;
	private String city;
	private String mobile;
	private float per;
	Scanner s1=new Scanner(System.in);
	Student s2=new Student();
	public void setDetails()
	{
		System.out.println("Eneter Student id");
		id=s1.nextInt();
		System.out.println("Eneter Student name");
		name=s1.next();
		System.out.println("Eneter Student dept");
		dept=s1.next();

		System.out.println("Eneter Student city");
		city=s1.next();
		System.out.println("Eneter Student mobile");
		mobile=s1.next();
		System.out.println("Eneter Student per");
		per=s1.nextFloat();

		s2.setId(id);
	}
	public void  getDetails()
	{
		System.out.println(s2.getId());
	}
}
