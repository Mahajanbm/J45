package com.example.demo;

import java.nio.channels.NonWritableChannelException;

public class Demo {

	static
	{
		Demo d1=new Demo();
		System.out.println("This is satic block 1");
	}
	{
		System.out.println("This is non-static block");//1=>1  100=>100
	}
	static
	{
		System.out.println("This is satic block 2");
	}
	void demo()
	{
		Demo d1=new Demo();
		System.out.println("Hello This is demo method");
	}

	public static void main(String[] args) {
		System.out.println("This is main method");
		System.out.println("This is main again");
		Demo d1=new Demo();
		d1.demo();
	}
}
