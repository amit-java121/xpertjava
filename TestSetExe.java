package com;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TestSetExe {
	public static void main(String[] args) {
		//HashSet<String> hashset = new HashSet<String>();
		//LinkedHashSet<String> hashset = new LinkedHashSet<String>();
		TreeSet<String> hashset = new TreeSet<String>();
		
		hashset.add("nitin");
		hashset.add("nitehs");
		hashset.add("abhijit");
		hashset.add("sambhaji");
		hashset.add("vaisnavi");
		hashset.add("nitin");
		hashset.add("vaisnavi");
		hashset.add("nitin");
		
		NavigableSet<String> orderchang = hashset.descendingSet();
		
		
		//Iterator<String> itr = hashset.iterator();
		
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		for(String set:orderchang) {
			System.out.println(set);
		}
	}

}
