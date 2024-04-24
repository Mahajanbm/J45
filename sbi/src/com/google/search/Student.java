package com.google.search;

import java.util.Scanner;

public class Student {

	int id;
	String name;
	String city;
	static	Student s1=new Student();
	static void data()
	{ 

		Scanner s2=new Scanner(System.in);
		System.out.println("Enter  Details");
		System.out.println("Enter Student  Id");
		s1.id=s2.nextInt();
		System.out.println("Enter Student Name:");
		s1.name=s2.next();
		System.out.println("Enter Student City");
		s1.city=s2.next();
	}
	static void dispaly()
	{

		System.out.println("Id is: "+s1.id);
		System.out.println("Name is: "+s1.name);
		System.out.println("salary is: "+s1.city);
	}
}
