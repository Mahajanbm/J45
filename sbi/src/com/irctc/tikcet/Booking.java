package com.irctc.tikcet;

import java.util.Scanner;

public class Booking {
	static String userId;
	String pass;
		
	void getdata()
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter UserID");
		Booking.userId=s1.next();
		System.out.println("Enter Password");
		pass=s1.next();
		//user input
	}
	static	  void display()
	{ Booking b1=new Booking();
		System.out.println("Userid is : "+Booking.userId);
		System.out.println("Password is: " +b1.pass);
		//display data
	}
}
