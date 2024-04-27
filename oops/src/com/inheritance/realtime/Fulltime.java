package com.inheritance.realtime;

public class Fulltime extends Employe{
	private String flltimework;
	void ftEmpData() {
		System.out.println("This is Full Time Employee Data");
	}
	public String getFlltimework() {
		return flltimework;
	}
	public void setFlltimework(String flltimework) {
		this.flltimework = flltimework;
	}
	
}
