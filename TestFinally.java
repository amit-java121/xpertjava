package com;

public class TestFinally {
	
	public static void main(String[] args) {
		System.out.println("1");
		System.out.println("2");
		try{
		
			//System.exit(0);
			int c =5/0;
		
		}catch(ArithmeticException e){
			System.out.println("catch block");
		}finally {
			System.out.println("finally called");
		}
		System.out.println("3");
		System.out.println("4");
		System.out.println("5");
	}

}
