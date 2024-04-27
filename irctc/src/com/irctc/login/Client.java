package com.irctc.login;

public class Client {
	int x=90;//instance variable non-static variable
	static int y=100;//static variable
	public static void main(String[] args) {
		Client c1=new Client();
		int x=50;//local variable
		System.out.println(x);
		System.out.println(c1.x);
		System.out.println(Client.y);

	}
}
