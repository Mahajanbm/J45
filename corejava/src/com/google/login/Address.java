package com.google.login;

public class Address {

	private int flatno;
	private String area;
	private String city;
	private String state;
	private String country;
	private int pincode;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int flatno, String area, String city, String state, String country, int pincode) {
	
		this.flatno = flatno;
		this.area = area;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
	}
	
	@Override
	public String toString() {
		return "Address [flatno=" + flatno + ", area=" + area + ", city=" + city + ", state=" + state + ", country="
				+ country + ", pincode=" + pincode + "]";
	}
	
}
