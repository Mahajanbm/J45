package com.exception.demo;

import java.io.Serializable;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		try {
			//Serializable s2=new Throwable();//s2 is reference
			//Throwable t1=new Exception();//t1 reference
			//Throwable t2=new Throwable();//t2 object
			//Exception e1=new Exception();//e1 object
			//Serializable s3=new Exception();//s3 reference
			Scanner s1=new Scanner(System.in);
			System.out.println("Enter First no");
			int a=s1.nextInt();
			System.out.println("Enter Second no");
			int b=s1.nextInt();
			int result=a/b;
			System.out.println("Division is: "+result);
		}
		
		catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("Enter Integer Data Only");
		}

		catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Enter Integer Data Only  second no should not be 0 ");
		}
		catch (Exception e) {
			System.out.println("Error");
			// TODO: handle exception
		}

	}
}
