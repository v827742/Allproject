package com.cjc.app.fl.master.main.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Sanction {

	@Id
	private int loanId;
	@OneToOne(cascade = CascadeType.ALL)
	private CustomerDetails customerdetails;
	@OneToOne(cascade = CascadeType.ALL)
	private Vehicle vehicleId;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Loan loan;
	private String cmremarks;
	private String generatedDate;
	private String customerIntimation;
	private String customerIntimationDate;
	
	public Loan getLoan() {
		return loan;
	}
	public void setLoan(Loan loan) {
		this.loan = loan;
	}
	public String getCmremarks() {
		return cmremarks;
	}
	public void setCmremarks(String cmremarks) {
		this.cmremarks = cmremarks;
	}
	public String getGeneratedDate() {
		return generatedDate;
	}
	public void setGeneratedDate(String generatedDate) {
		this.generatedDate = generatedDate;
	}
	public String getCustomerIntimation() {
		return customerIntimation;
	}
	public void setCustomerIntimation(String customerIntimation) {
		this.customerIntimation = customerIntimation;
	}
	public String getCustomerIntimationDate() {
		return customerIntimationDate;
	}
	public void setCustomerIntimationDate(String customerIntimationDate) {
		this.customerIntimationDate = customerIntimationDate;
	}
	public int getLoanId() {
		return loanId;
	}
	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}
	public CustomerDetails getCustomerdetails() {
		return customerdetails;
	}
	public void setCustomerdetails(CustomerDetails customerdetails) {
		this.customerdetails = customerdetails;
	}
	public Vehicle getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(Vehicle vehicleId) {
		this.vehicleId = vehicleId;
	}
	
}
