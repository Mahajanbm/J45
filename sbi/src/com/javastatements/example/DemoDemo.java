package com.javastatements.example;



public class DemoDemo {
	
	
	public static void main(String[] args) {
		int x=100,y=100,z=100;
		if(x>y && x>z )
		{
			System.out.println("x is greater no");
		} else  if(y>x && y>z){
			System.out.println("Y is greater");
		}
		else  if(z>y && z>x){
			System.out.println("z is greater");
		}
		else  if(x==y && x!=z ){
			System.out.println(" x and y are same");
		}
		else if(x==z && x!=y)
		{
			System.out.println(" x and z are same");	
		}
		else if(y==z && y!=x)
		{
			System.out.println(" y and z are same");	
		}
		else if(x==y && y==z) {
			System.out.println("all are same");
		}

	}
}
