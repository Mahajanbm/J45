package com.google.login;

import java.util.Scanner;

public class UserInput {
	int id;//nextInt()//input Int
	String name;//next(); input String
	float salary;//nextFloat(); input float
	String designation;
	void getdata()
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter User Details");
		System.out.println("Enter User Id");
		id=s1.nextInt();
		System.out.println("Enter User Name:");
		name=s1.next();
		System.out.println("Enter User Salary");
		salary=s1.nextFloat();
		System.out.println("Enter User Designation:");
		designation=s1.next();

		System.out.println("Id is: "+id);
		System.out.println("Name is: "+name);
		System.out.println("salary is: "+salary);
		System.out.println("Designation is : "+designation);


		
	}
}
