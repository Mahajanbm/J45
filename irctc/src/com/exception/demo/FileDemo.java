package com.exception.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileDemo {
	public static void main(String[] args)  {

		File f1=new File("C:\\Users\\Admin\\git\\J45\\irctc\\src\\com\\exception\\demo\\Test.java");
		try {

			FileInputStream  f2=new FileInputStream(f1);
			System.out.println("File found");
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println("File not found");
		}
		
	}
}
