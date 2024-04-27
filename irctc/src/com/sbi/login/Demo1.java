package com.sbi.login;

public class Demo1 {
	static{
		System.out.println("This static block");
	}

	{
		System.out.println("THis is non-static block in java");

	}
	
	{
		System.out.println("This is non-static block 2");
	}
	public static void main(String[] args) {
		System.out.println("This is main method");
		Demo1 ds1=new Demo1();
		Demo1 d2=new Demo1();

	}
}
