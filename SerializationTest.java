package com.Ser;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationTest {

	public static void main(String[] args) {
		
		Payment payment = new Payment("Nitin", "hdfc", 123645987);
		
		try {
		FileOutputStream fileOutputStream = new FileOutputStream("C:\\batch\\demo.txt");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		
		objectOutputStream.writeObject(payment);
		
		objectOutputStream.flush();
		
		objectOutputStream.close();
		
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Object has been parsed");
	}
}
