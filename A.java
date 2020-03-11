package com;

public class A {
	
	void m1(){
		
	}
	public static void main(String[] args) {
		
		//A a=null;
		try{	
		System.out.println("1");
			System.out.println("2");
			
			try{
				System.out.println("200");
			int a=10/0;
			System.out.println("100");
			}catch(ArithmeticException e){
				System.out.println("inside catch"+e);
			}
			A a=null;
			a.m1();
		}catch(Exception e){
			System.out.println("inside outer catch");
		}
			//a.m1();
			System.out.println("3");
			System.out.println("4");
			System.out.println("5");
			System.out.println("6");
			
	}

}
