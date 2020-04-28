package com.Ser;

import java.io.Serializable;

public class Payment implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7453164789556586457L;
	transient String customerName;
	static String customerBankName;
	Integer cardNumber;
	
	public Payment(String customerName, String customerBankName, Integer cardNumber) {
		super();
		this.customerName = customerName;
		this.customerBankName = customerBankName;
		this.cardNumber = cardNumber;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerBankName() {
		return customerBankName;
	}
	public void setCustomerBankName(String customerBankName) {
		this.customerBankName = customerBankName;
	}
	public Integer getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(Integer cardNumber) {
		this.cardNumber = cardNumber;
	}
	
	

}
