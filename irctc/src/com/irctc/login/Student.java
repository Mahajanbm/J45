package com.irctc.login;

public class Student {
	int x=50;
	String nmae="Joe";
	static float per=60.5f;
	static int b=10;
	void demo()
	{
		System.out.println(x);
		System.out.println(nmae);
		System.out.println(Student.per);
		System.out.println(Student.b);
	}
	static	Student s2=new Student();
	static void data()
	{
		Student s1=new Student();
		System.out.println(s1.x);
		System.out.println(s1.nmae);
		System.out.println(Student.b);
		System.out.println(Student.per);

	}
}
