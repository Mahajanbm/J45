package com.datatype.conversion;

public class Test {

	public static void main(String[] args) {
		byte b=50;// 8 bits
		int x1=500;
		byte b2=(byte)x1;
		int x=b;//32bits automatic conversion
		short s=100;
		int y=s;//implicit conversion in java
		int z=55;
		float f=z;
		float f1=105.5f;
		double d=f1;

		int p=100;
		byte b1=(byte)p; float f2=45.50f;
		int p1=(int)f2;//explicit conversion in java
		System.out.println(b2);
		
		
		double d1=454545.58454646545545;
		 float f3=(float)d1;
	}

}
