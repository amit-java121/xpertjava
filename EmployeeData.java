package com;

import java.util.ArrayList;

public class EmployeeData {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setEmpName("Nitesh");
		emp.setEmpAge(22);
		emp.setEmpAddress("Pune");
		
		Employee emp2 = new Employee("Nitin", 26, "mumbai");
		Employee emp3 = new Employee("Abhijit", 22, "Latur");
		Employee emp4 = new Employee("Vaishnvi", 25, "Magarpatta");
		
		ArrayList<Employee> employeeList = new ArrayList<Employee>();
		
		employeeList.add(emp);
		employeeList.add(emp2);
		employeeList.add(emp3);
		employeeList.add(emp4);
		
		//System.out.println(employeeList.size());
		for(int i=0;i<employeeList.size();i++) {
		Employee printObject = employeeList.get(i);
		if(printObject.getEmpAge() > 24) {
			
			System.out.println(printObject.getEmpName());
		}
//			System.out.println(printObject.getEmpName());
//			System.out.println(printObject.getEmpAge());
//			System.out.println(printObject.getEmpAddress());
			//System.out.println(employeeList.get(i).toString());
		}
		
		
	}
}
