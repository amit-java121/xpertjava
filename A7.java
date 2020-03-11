package com;

public class A7 {

	void m1(int age) throws ArithmeticException {
		
		if(age > 10){
			throw new ArithmeticException("u r not eligiable for game");
		}
		
	}
	public static void main(String[] args) {
		A7 a7 = new A7();
		try{
		a7.m1(12);
		}catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}
	}
}
