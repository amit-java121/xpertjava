package com;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TestMapEx {

	public static void main(String[] args) {
		//HashMap<Integer, String> map = new HashMap<Integer, String>();
		//LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
		//Hashtable<Integer, String> map = new Hashtable<Integer, String>();
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(102, "abc1");
		map.put(101, "abc2");
		map.put(104, "abc3");
		//map.put(103, null);
		//map.put(104, null);
		
//		map.put(100, "abhijit");
		//map.put(null, "abc1");
		//map.put(null, "abc1");
		
		for(Entry<Integer, String> m:map.entrySet()) {
			System.out.println("key: "+m.getKey()+" value: "+m.getValue());
		}
	}
}
