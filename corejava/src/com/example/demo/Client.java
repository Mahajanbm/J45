package com.example.demo;

public class Client {
	static {
		Client c1=new Client();
		Client c2=new Client();
		System.out.println("This is static block1");
	}
	static
	{
		System.out.println("This is static block2");

	}

	{

		System.out.println("This  is non-static block");
	}
	{

		System.out.println("This  is non-static block1");
	}
	public static void main(String[] args) {

	}
}
