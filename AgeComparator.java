package com.a;

import java.util.Comparator;

public class AgeComparator implements Comparator<Employee>{


	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getEmpAge().compareTo(o2.getEmpAge());
	}

}
