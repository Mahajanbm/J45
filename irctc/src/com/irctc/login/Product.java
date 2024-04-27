package com.irctc.login;



public class Product {
	private  int pId;
	private	String pName;

	public void setId(int a)
	{
		pId=a;
	}
	public void getId()
	{
		System.out.println(pId);
	}

	public void setName(String b)
	{
		pName=b;;
	}
	public void getName()
	{
		System.out.println(pName);
	}


	public void setData(int a,String b)
	{

		pId=a;
		pName=b;
	}
	public void getData()
	{
		System.out.println(pId);

		System.out.println(pName);
	}
}
