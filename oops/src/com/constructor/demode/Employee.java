package com.constructor.demode;
public class Employee {
	String str,str1,str2;
	public Employee(String str, String str1, String str2) {

		this.str = str;
		this.str1 = str1;
		this.str2 = str2;
	}
	public Employee() {
		System.out.println("This is default constructor of Employee Class");
	}
	public Employee(String str) {
		this.str=str;
		System.out.println("This is parameterized constructor of Employee Class: "+str);
	}

	public Employee(Employee e)
	{
		this.str=e.str;
		this.str1=e.str1;
		this.str2=e.str2;
		System.out.println("Value of copy constructor is "+str);


	}
	public static void main(String[] args) {
		Employee e1=new Employee("Pune");
		//e1=pune
		Employee e2=new Employee(e1);
	}
}
