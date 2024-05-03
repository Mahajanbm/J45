package com.poly.demo;

public class Student {

	public Student() {
		System.out.println("This is Student constrtcutor");
	}
	public Student(int x) {
		System.out.println("This is Student int constrtcutor");
	}
	public Student(String str) {
		System.out.println("This is Student String constrtcutor");
	}
	 public static void main(String[] args) {
		Student s1=new Student(10);
	}
}
