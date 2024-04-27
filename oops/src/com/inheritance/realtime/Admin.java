package com.inheritance.realtime;

public class Admin extends Org{
	private int adminid;
	private String adminname;

	void adminData() {
		System.out.println("This is Amdin Class");
	}

	public int getAdminid() {
		return adminid;
	}

	public void setAdminid(int adminid) {
		this.adminid = adminid;
	}

	public String getAdminname() {
		return adminname;
	}

	public void setAdminname(String adminname) {
		this.adminname = adminname;
	}

}
