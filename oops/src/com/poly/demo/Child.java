package com.poly.demo;

public class Child extends Parent {
	@Override
	public	void demo(int x)
	{
		super.demo(50);
		System.out.println("This is Child Demo");
	}
}
