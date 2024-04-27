package com.irctc.login;

public class Emp {
	private int eId;
	private String ename;
	private String ecity;

	public void setData(int eId, String ename,String ecity)
	{
		this.eId=eId;
		this.ename=ename;
		this.ecity=ecity;

	}

	public void getData()
	{
		System.out.println(eId);
		System.out.println(ename);
		System.out.println(ecity);
	}


}
