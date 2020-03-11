package com;

public class A2 {

	public static void main(String[] args) {
		
			
			System.out.println("1");
				System.out.println("2");
				
				try{
					System.out.println("200");
				int a=10/0;
				System.out.println("100");
				}catch(ArithmeticException e){
					System.out.println("inside catch"+e.getMessage());
				}catch(Exception e){
					System.out.println("somthing went wrong");
				}
				//a.m1();
				System.out.println("3");
				System.out.println("4");
				System.out.println("5");
				System.out.println("6");
			
	}
}
