package com.amazon.items;

public class Product {
	private int pId;
	private String pName;
	private float pPrice;
	private String pDescription;
	private String pCategory;
	private String pExpiry;
	public void setData(int a,String b,float c,String d,String e,String f)
	{
		pId=a;
		pName=f;
		pPrice=c;
		pDescription=b;
		pCategory=e;
		pExpiry=f;

	}
	public void getData()
	{
		System.out.println("product Id is: "+pId);
		System.out.println("product name is: "+pName);
		System.out.println("product price is: "+pPrice);
		System.out.println("product Description is: "+pDescription);
		System.out.println("product category is: "+pCategory);
		System.out.println("product Expiry is: "+pExpiry);
	}
}
