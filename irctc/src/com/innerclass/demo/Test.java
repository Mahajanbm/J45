package com.innerclass.demo;

import com.innerclass.demo.OuterClass.Inner1;
import com.innerclass.demo.OuterClass.Inner2;

public class Test {
	public static void main(String[] args) {
		OuterClass o1=new OuterClass();
		Inner1 i1=o1.new Inner1();
		i1.sub();
		Inner1.add();
		Inner2 i2=o1.new Inner2();
		i2.div();
		Inner2.mul();


	}
}
