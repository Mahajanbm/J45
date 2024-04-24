package com.icici.transaction;
public class Demo {
	static
	{
		System.out.println("This  is static block1");
	}
	{
		System.out.println("This is non-static in  block1");	
	}
	static
	{
		System.out.println("this is static block 2");
	}
	void demo()
	{
		Demo d1=new Demo();
		System.out.println("THis is demo method");
	}
	public static void main(String[] args) {
		System.out.println("This is main Method");
		
		Demo d1=new Demo();//
		//d1.demo();

	}
}
