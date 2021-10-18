package com.cjc.app.fl.master.main.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CustomerDetails {

	@Id
	private int customerId;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public Double getRequiredLoanAmount() {
		return requiredLoanAmount;
	}
	public void setRequiredLoanAmount(Double requiredLoanAmount) {
		this.requiredLoanAmount = requiredLoanAmount;
	}
	private String customerName;
	private String mobileNo;
	private Double requiredLoanAmount;
	
}
