package com.cjc.app.fl.master.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Sanction {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sanctionId;
	
	@OneToOne(cascade = CascadeType.ALL)
	private CustomerDetails customerDetails;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Vehicle vehicle;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Loan loan;
	
	private String cmRemarks;
	private String genratedBy;
	private String genratedDate;
	private String customerIntimation;
	private String customerIntimationDate;
	
	public int getSanctionId() {
		return sanctionId;
	}
	public void setSanctionId(int sanctionId) {
		this.sanctionId = sanctionId;
	}
	public CustomerDetails getCustomerDetails() {
		return customerDetails;
	}
	public void setCustomerDetails(CustomerDetails customerDetails) {
		this.customerDetails = customerDetails;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public Loan getLoan() {
		return loan;
	}
	public void setLoan(Loan loan) {
		this.loan = loan;
	}
	public String getCmRemarks() {
		return cmRemarks;
	}
	public void setCmRemarks(String cmRemarks) {
		this.cmRemarks = cmRemarks;
	}
	public String getGenratedBy() {
		return genratedBy;
	}
	public void setGenratedBy(String genratedBy) {
		this.genratedBy = genratedBy;
	}
	public String getGenratedDate() {
		return genratedDate;
	}
	public void setGenratedDate(String genratedDate) {
		this.genratedDate = genratedDate;
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
	

}
