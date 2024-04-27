package com.imp.example;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Test {
	public static void main(String[] args) {
		int i=5;
		//System.out.println(i++ + ++i);//0
		//System.out.println(++i + --i);//2
		//System.out.println(i-- - --i);//2
		//System.out.println(i--);//
		//i++;//post increment
		//++i;//pre increment
		//System.out.println(i++);//0
		//System.out.println(++i);//1
		//System.out.println(i--);
		//System.out.println(i);
		System.out.println(--i + ++i);//9
		System.out.println(i-- - ++i);//0
		System.out.println(++i + i--);////12
		System.out.println(i--);//5
		System.out.println(i);//4
	}
}
