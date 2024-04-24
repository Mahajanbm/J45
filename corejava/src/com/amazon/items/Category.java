package com.amazon.items;

public class Category {
	private int cId;
	private String cName;
	private String cDesc;
	
	public void id(int cId)
	{
		this.cId=cId;
	}
	public void idname(int cId,String cName)
	{
		this.cId=cId;
		this.cName=cName;
	}
	
	public void setData(int cId,String cName,String cDesc)
	{
		this.cId=cId;
		this.cName=cName;
		this.cDesc=cDesc;
	}
	
	public void name(String cName)
	{
		this.cName=cName;
	}
	public void namedesc(String cName,String cDesc)
	{
		this.cName=cName;
		this.cDesc=cDesc;
	}
	
	public void desc(String cDesc)
	{
		this.cDesc=cDesc;
	}
	public void descId(String cDesc,int cId)
	{
		this.cDesc=cDesc;
		this.cId=cId;
	}
	
	
	
	
	

}
