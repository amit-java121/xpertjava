package com.Ser;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationTest {
	
	public static void main(String[] args) {
		
		try {
		ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("C:\\\\batch\\\\demo.txt"));
		
		Payment obj = (Payment)objectInputStream.readObject();
		
		System.out.println(obj.customerBankName);
		System.out.println(obj.customerName);
		System.out.println(obj.cardNumber);
		
		objectInputStream.close();
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
