package com.oops.demo;

import java.util.Scanner;

public class BussinessOperation {
private int id;
private int flatno;
	
Scanner s1=new Scanner(System.in);
Address a1=new Address();
Employee e1=new Employee();

public 	void setDetails()
	{
	System.out.println("ENter Emp id");
	id=s1.nextInt();
	System.out.println("ENterv flat no");
	flatno=s1.nextInt();
	
	a1.setFlatno(flatno);
	e1.setId(id);
		
	
	}


 public void getDetails()
 {
	 System.out.println(e1.getId());
	 System.out.println(a1.getFlatno());
 }
}
