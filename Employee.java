package com;

public class Employee {
	String empName;
	Integer empAge;
	String empAddress;
	
	public Employee() {}
	
	public Employee(String empName, Integer empAge, String empAddress) {
		super();
		this.empName = empName;
		this.empAge = empAge;
		this.empAddress = empAddress;
	}
	
	

	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Integer getEmpAge() {
		return empAge;
	}
	public void setEmpAge(Integer empAge) {
		this.empAge = empAge;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empAge=" + empAge + ", empAddress=" + empAddress + "]";
	}
}
