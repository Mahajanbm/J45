package com.flipkart.login;

public class Address {
	private int flatno;
	private String area;
	
	public Address() {
		
	}
	
	public Address(int flatno, String area) {
	
		this.flatno = flatno;
		this.area = area;
	}

	public int getFlatno() {
		return flatno;
	}
	public void setFlatno(int flatno) {
		this.flatno = flatno;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "Address [flatno=" + flatno + ", area=" + area + "]";
	}
}
