package com.google.login;

public class Client {

	public static void main(String[] args) {
		Department d1=new Department();
		d1.setdId(0);
		d1.setdName("CS");
		d1.setdHod("MM");
		d1.setdWing("A");
		System.out.println(d1);
		Student s1=new Student(101,"mahi","Pune",d1);
		
		System.out.println(d1);
	//	Department d2=new Department(0, null, null, null)
		
		
		
	}
}
