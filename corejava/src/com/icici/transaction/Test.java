package com.icici.transaction;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Test {
	static
	{
		try {
			Connection connection=DriverManager.getConnection
					("jdbc:mysql://localhost:3306/sdaj45","root","1234");
			
			Statement statement=connection.createStatement();
			ResultSet rSet=statement.executeQuery("Select * from tblProduct");
			while(rSet.next())
			{
				System.out.println(rSet.getString(1)+" "+rSet.getFloat(2)+" "+rSet.getString(3));
			}
			
			
			System.out.println("Sucuessfully connected with database");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
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
