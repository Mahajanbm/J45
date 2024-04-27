package com.sbi.login;

public class Employee {
	static {
		System.out.println("This is static block of Employee class");
	}
	{
		System.out.println("This is non-static block of employee class");
	}
}
