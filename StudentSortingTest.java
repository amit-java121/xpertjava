package com.a;

import java.util.ArrayList;
import java.util.Collections;

public class StudentSortingTest {
	public static void main(String[] args) {
//		Student st = new Student("Nitin",22,100,"Pune");
//		Student st1 = new Student("Nitesh",21,101,"Mumbai");
//		Student st2 = new Student("Abhijit",23,102,"Nagpur");
//		Student st3 = new Student("Vaishnavi",19,103,"Latur");
//		
//		ArrayList<Student> list = new ArrayList<Student>();
//		list.add(st);
//		list.add(st1);
//		list.add(st2);
//		list.add(st3);
		
		Employee st = new Employee("Nitin",22,"Pune");
		Employee st1 = new Employee("Nitesh",22,"Mumbai");
		Employee st2 = new Employee("Abhijit",23,"Nagpur");
		Employee st3 = new Employee("Vaishnavi",18,"Latur");
		
		ArrayList<Employee> listEmp = new ArrayList<Employee>();
		listEmp.add(st);
		listEmp.add(st1);
		listEmp.add(st2);
		listEmp.add(st3);
//		
//		for(Student stt:list) {
//			System.out.println(stt.getStName());
//			System.out.println(stt.getStAge());
//			System.out.println(stt.getRollNum());
//			System.out.println(stt.getStAddress());
//			System.out.println("==========");
//		}
		
	//	Collections.sort(list);
		
		Collections.sort(listEmp, new AgeComparator());
		
	
		for(Employee stt:listEmp) {
			System.out.println(stt.getEmpName());
			System.out.println(stt.getEmpAge());
			System.out.println(stt.getEmpAddress());
			System.out.println("==========");
		}
		
		
	Collections.sort(listEmp, new NameComparator());
		
		for(Employee stt:listEmp) {
			System.out.println(stt.getEmpName());
			System.out.println(stt.getEmpAge());
			System.out.println(stt.getEmpAddress());
			System.out.println("==========");
		}
		
	}

}
