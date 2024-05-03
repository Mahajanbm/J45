package com.interfacedemo.example;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		while(true)
		{
			Scanner s1=new Scanner(System.in);
			System.out.println("Curd Operation");
			System.out.println("1.Create");
			System.out.println("2.fetch");
			System.out.println("3.Update");
			System.out.println("4.Delete");
			System.out.println("Enter Your Choice");
			int x=s1.nextInt();

			switch (x) {
			case 1: {
				Create c1=new CreateImple();
				c1.create();

				break;
			}
			case 2: {

				Fetch f1=new FetchImple();
				f1.fetech();
				break;
			}
			case 3: {

				break;
			}
			case 4: {

				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + x);
			}
		}
	}
}
