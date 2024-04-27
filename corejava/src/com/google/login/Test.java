package com.google.login;

public class Test {
	public static void main(String[] args) {
//Address a2=new Address();
		Address a1=new Address(104, "shivajinagar", "Pune", "MH", "INDIA", 411001);
		Employee e1=new Employee(1, "Sunil", a1);
		System.out.println(e1);
	}
}
