package com.hdfc.loan;

public class Employee {
	private int id;
	private String name;
	private float salary;
	public void setData(int a,String b,float c)
	{
		id=a;
		name=b;
		salary=c;
	}
	public void getData()
	{
		System.out.println("Id is: "+id);
		System.out.println("Name is: "+name);
		System.out.println("salary  is: "+salary);
	}

}
