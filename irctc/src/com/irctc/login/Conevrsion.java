package com.irctc.login;

public class Conevrsion {
	public static void main(String[] args) {
		byte b1=127;//8bits -128 to 127
		int a= b1;  //32bits //implicit conversion in java automatic
		System.out.println(a);
		short s=55; //16 bits
		int x=s;
		
		 double d=500; //64bits
		 byte b=(byte)d;
		 System.out.println(b);//explicit conversion in java
		
	}
}
