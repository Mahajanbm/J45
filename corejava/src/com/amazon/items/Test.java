package com.amazon.items;


public class Test {
	public static void main(String[] args) {
		Product p1=new Product();
		p1.setData(11111, "mobile", 12345.5f, "This is mobile", "Electronics", "12-April-30");
		p1.getData();
		p1.setData(0, "mahajan", 54541.f, "Pune", "welcome", "This is java Training");
		p1.getData();
		
	}
}
