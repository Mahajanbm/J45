package com.oops.example;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		int a;
		Scanner s1=new Scanner(System.in);

		while(true)
		{	
			System.out.println("Details of Of Org");
			System.out.println("1. AdminDetails");
			System.out.println("2. TeacherDetails");
			System.out.println("3. StudentDetails");
			System.out.println("Enter Your choice");
			a=s1.nextInt();

			switch (a) {
			case 1: {
				AdminOperation a1=new AdminOperation();
				a1.setAdminDetails();
				a1.getAdminDetails();


				break;
			}
			case 2: {

				TeacherOperation a1=new TeacherOperation();
				a1.setTeacherDetails();
				a1.getTeacherDetails();
				break;
			}
			case 3: {
				StudentOperation s2=new StudentOperation();
				s2.setStudentDetails();
				s2.getStudentDetails();
				break;
			}
			default:
				System.out.println("enter valid data");


			}
		}}
}


