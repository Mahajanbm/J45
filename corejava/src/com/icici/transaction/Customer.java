package com.icici.transaction;

import java.util.Scanner;

public class Customer {
	 
	static
	{
		System.out.println("This  is static block");//static block in java
	}
	 public static void main(String[] args) {
		 
		System.out.println("This is main method");
		int x;
		Scanner s1=new Scanner(System.in);

		System.out.println("Enter your choice");
		System.out.println("1.Addition");
		System.out.println("2.Substraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		x=s1.nextInt();
		switch(x)
		{
		case 1:
			System.out.println("This is case 1");
			break;
		case 2:
			System.out.println("This is case 2");
			break;
		case 3:
			System.out.println("This is case 3");
			break;
		default:
			System.out.println("Invalid input");
		}
	}

}
