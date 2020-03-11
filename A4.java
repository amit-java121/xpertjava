package com;

import java.io.FileInputStream;
import java.io.IOException;

public class A4 {

	void m1() throws IOException{
		FileInputStream fs = new FileInputStream("abc.txt");
	}
	public static void main(String[] args) {
		A4 a4 = new A4();
		try {
			a4.m1();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
