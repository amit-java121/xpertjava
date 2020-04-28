package com.a;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapTest {
	
	public static void main(String[] args) {
		HashMap<String, ArrayList<String>> mapCountry = new HashMap<String, ArrayList<String>>();
		ArrayList<String> cityList = new ArrayList<String>();
		cityList.add("Pune");
		cityList.add("Mumbai");
		cityList.add("Nagpur");
		
		ArrayList<String> cityListUp = new ArrayList<String>();
		cityListUp.add("Noida");
		cityListUp.add("Agra");
		cityListUp.add("Lucknow");
		
		ArrayList<String> cityListMp = new ArrayList<String>();
		cityListMp.add("Indore");
		cityListMp.add("Bhopal");
		cityListMp.add("Jabalpur");
		
		mapCountry.put("MH", cityList);
		mapCountry.put("UP", cityListUp);
		mapCountry.put("MP", cityListMp);
		//////////////////////////////////////////////////
		
		ArrayList<String> stateCity = mapCountry.get("UP");
		
		for(String city:stateCity) {
			System.out.println(city);
		}
		
		
	}

}
