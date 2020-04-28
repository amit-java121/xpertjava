package com.a;

public class Student implements Comparable<Student>{

	private String stName;
	private Integer stAge;
	private Integer rollNum;
	private String stAddress;
	
	public Student() {}
	public Student(String stName, Integer stAge, Integer rollNum, String stAddress) {
		super();
		this.stName = stName;
		this.stAge = stAge;
		this.rollNum = rollNum;
		this.stAddress = stAddress;
	}
	
	@Override
	public String toString() {
		return "Student [stName=" + stName + ", stAge=" + stAge + ", rollNum=" + rollNum + ", stAddress=" + stAddress
				+ "]";
	}
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	public Integer getStAge() {
		return stAge;
	}
	public void setStAge(Integer stAge) {
		this.stAge = stAge;
	}
	public Integer getRollNum() {
		return rollNum;
	}
	public void setRollNum(Integer rollNum) {
		this.rollNum = rollNum;
	}
	public String getStAddress() {
		return stAddress;
	}
	public void setStAddress(String stAddress) {
		this.stAddress = stAddress;
	}
	
	
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return stName.compareTo(o.stName);
	}
	
	
	
}
