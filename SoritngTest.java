package com.a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SoritngTest {
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("nitesh");
		list.add("nitin");
		list.add("abhijit");
		list.add("vaishnavi");
		
		list.add("aaaaaa");
		List<String> unModifiableList = Collections.unmodifiableList(list);
		unModifiableList.add("abc");
		
		
//		System.out.println("unsorted element");
//		for(String name:list) {
//			System.out.println(name);
//		}
//		
//		Collections.sort(list);
//		
//		System.out.println("sorted element");
//		for(String name:list) {
//			System.out.println(name);
//		}
		
	}

}
