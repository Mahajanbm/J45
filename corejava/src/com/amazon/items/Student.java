package com.amazon.items;

public class Student {
	private int rollno;
	private String name;
	private String collgeName;
	private String city;
	private String mobile;
	private String std;
	private float per;
	public void setData(int rollno,String name,String collegeName,String city,String mobile,String std,float per)
	{
		this.rollno=rollno;
		this.name=name;
		this.collgeName=collegeName;
		this.city=city;
		this.mobile=mobile;
		this.std=std;
		this.per=per;

	}
	public void getData()
	{
		System.out.println("Student RollNo is : "+rollno);
		System.out.println("Student name is: "+name);
		System.out.println("Student College is: "+collgeName);
		System.out.println("Student City is: "+city);
		System.out.println("Student mobile is: "+mobile);
		System.out.println("Student Std is: "+std);
		System.out.println("Student per is: "+per);

	}
}
