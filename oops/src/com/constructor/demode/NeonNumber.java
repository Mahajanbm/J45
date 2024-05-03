package com.constructor.demode;

import java.util.Scanner;

public class NeonNumber {
	public static void main(String[] args) {
		Scanner	s1=new Scanner(System.in);
		System.out.println("Enter number");
		int num=s1.nextInt();
		int sum=0;
		int	result=num*num;	
		int res=0;
		while(result>0)
		{
			int x=result%10;
			sum=sum+x;
			res=result/10;
		}
		if(num==sum)
		{
			System.out.println("Neon");
		}
		else {
			System.out.println("not Neon");
		}

	}
}
