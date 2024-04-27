package com.inheritance.realtime;

public class Employe extends Admin{
private int eid;
private String ename;
 void eData() {
	 System.out.println("This is Employee Class");
	 
 }
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
 
}
