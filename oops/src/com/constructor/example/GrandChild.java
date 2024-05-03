package com.constructor.example;

public class GrandChild  extends Child{

	static {
		System.out.println("This grand child static block");
	}

	{
		System.out.println("This is non-static block in PGrandChildArent class");
	}

	public static void main(String[] args) {
		//GrandChild g1=new GrandChild();
		//	GrandChild g2=new GrandChild();
		//Parent p1=new Parent();
	}
}
