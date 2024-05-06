package com.exception.demo;

public class DemoTest {
	public static void main(String[] args) {
		try {
			String str=null;
			System.out.println(str.charAt(0));
			//System.out.println(str.charAt(1));
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("Enter Only String data");
		}
		
	}
}
