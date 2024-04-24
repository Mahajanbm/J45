package com.amazon.login;

public class Test {
	 static int b=100;
	 int a=90;
	  void demo()
	  {
		  System.out.println(a);
		  System.out.println(Test.b);
	  }
	 
	 
	 
	public static void main(String[] args) {
		int a=50;
	
		Test t1=new Test();
		System.out.println(a);
		System.out.println(t1.a);
		System.out.println(Test.b);
	}
}
