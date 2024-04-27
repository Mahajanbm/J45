package com.inheritance.realtime;

public class Parttime extends Employe{
private String parttimework;
void ptEmpData() {
	System.out.println("This is Part Time Employee");
}
public String getParttimework() {
	return parttimework;
}
public void setParttimework(String parttimework) {
	this.parttimework = parttimework;
}

}
