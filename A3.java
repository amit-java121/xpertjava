package com;

public class A3 {
	void m1(int a,int b, A3 a3){
		 int c =a/b;
		 System.out.println(c);
		 a3.m2();
	}
	
	void m2(){
		System.out.println("m2 called");
	}
	
	public static void main(String[] args) {
		A3 a3 = new A3();
		//a3.m1(10,0, null);
		//a3.m1(10,new A3());
	}
}
