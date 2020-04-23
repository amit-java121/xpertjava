package com;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class TestArrayList {
	
	public static void main(String[] args) {
		
	//ArrayList<Integer> list = new ArrayList<>();
		Vector<String> list = new Vector<>();
		//LinkedList<String> linkedlist = new LinkedList<String>();
		
		list.add("abc");
		list.add("abc2");
		//abc10
		list.add(1,"abc3");
		list.add("abc4");
		list.add("abc5");
		
		list.add(3, null);
		
//		list.add(10);
//		list.add(20);
//		list.add(30);
//		list.add(40);
//		list.add(50.00);
//		list.add("amit11");
//		list.add("amit");
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
	}

}
