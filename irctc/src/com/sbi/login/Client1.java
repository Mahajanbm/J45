package com.sbi.login;

public class Client1 {
	static {
		System.out.println("This is static block of Client1");
	}
	{
		System.out.println("This is non-static block of Client1");
	}
	public static void main(String[] args) {
		System.out.println("THis is main method");
		Employee e1=new Employee();
	}
}
