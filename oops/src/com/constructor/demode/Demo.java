package com.constructor.demode;

public class Demo {
	int x;

	public Demo() {
		System.out.println("This is default COnstructor");
	}

	public Demo(int x) {

		this.x = x;
		System.out.println(x);
	}

	public Demo(Demo d)
	{
		 this.x=d.x;
		 System.out.println("This is copy constructor in java :"+x);
	}

	public static void main(String[] args) {
		Demo d1=new Demo(1460);//x=10
		Demo d2=new Demo(d1);
	}


}
