package com.cjc.app.fl.master.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CustomerDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private int customerId;
	private String mobileNo;
	private double requiredLoanAmount;
	private String customerName;
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public double getRequiredLoanAmount() {
		return requiredLoanAmount;
	}
	public void setRequiredLoanAmount(double requiredLoanAmount) {
		this.requiredLoanAmount = requiredLoanAmount;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

}
