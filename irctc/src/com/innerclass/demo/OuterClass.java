package com.innerclass.demo;

public class OuterClass {
	static int a=50;
	int b=20;
	int c;

	class Inner1
	{
		static void add()
		{
			OuterClass o1=new OuterClass();
			o1.c=OuterClass.a+o1.b;
			System.out.println("Addition is: "+o1.c);
		}
		void sub()
		{
			c=OuterClass.a-b;
			System.out.println("Substraction is: "+c);
		}

	}
	class Inner2
	{
		static void mul()
		{
			OuterClass o1=new OuterClass();
			o1.c=OuterClass.a*o1.b;
			System.out.println("Multiplication is: "+o1.c);
		}
		void div()
		{
			c=OuterClass.a/b;
			System.out.println("Division is: "+c);
		}

	}
}
