package com.exception.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcDemo {
	public static void main(String[] args) throws SQLException {
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=	DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/demo","root","1234");
			System.out.println("Connection done ");
			String string="Hello";
			System.out.println(string.charAt(0));
			System.out.println("Hello");

		}
		catch (ClassNotFoundException e) {
			// TODO: handle exception
			System.out.println("Class Not Found");
		}
		catch (SQLException e) {
			// TODO: handle exception
			System.out.println("SQL Exception");
		}
		catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("Null Pointer  Exception");
		}

		finally {
			con.close();
			System.out.println("Connecton close");
		}
	}
}
