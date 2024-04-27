package com.google.login;

public class Student {
	private int rollno;
	private String name;
	private String city;
	private Department department;

	public Student(int rollno, String name, String city, Department department) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.city = city;
		this.department = department;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", city=" + city + ", department=" + department + "]";
	}

}
