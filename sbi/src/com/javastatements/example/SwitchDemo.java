package com.javastatements.example;

import java.util.Scanner;

public class SwitchDemo {
	public static void main(String[] args) {
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
