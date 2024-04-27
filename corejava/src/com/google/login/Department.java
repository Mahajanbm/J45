package com.google.login;

public class Department {
	private int dId;
	private String dName;
	private String dHod;
	private String dWing;
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(int dId, String dName, String dHod, String dWing) {
		super();
		this.dId = dId;
		this.dName = dName;
		this.dHod = dHod;
		this.dWing = dWing;
	}

	public int getdId() {
		return dId;
	}
	public void setdId(int dId) {
		this.dId = dId;
	}
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	public String getdHod() {
		return dHod;
	}
	public void setdHod(String dHod) {
		this.dHod = dHod;
	}
	public String getdWing() {
		return dWing;
	}
	public void setdWing(String dWing) {
		this.dWing = dWing;
	}

	@Override
	public String toString() {
		return "Department [dId=" + dId + ", dName=" + dName + ", dHod=" + dHod + ", dWing=" + dWing + "]";
	}



}
