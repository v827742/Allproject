package com.cjc.app.fl.master.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Disburse {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int disbursementId;
	private int caseNo;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Dealer dealer;
	private String modeOfTransfer;
	private double payableLoanAmount;
	private String amountTransferDate;
	
	@OneToOne(cascade = CascadeType.ALL)
	private CustomerDetails customer;
	private String typeOfLoan;
	
	public int getCaseNo() {
		return caseNo;
	}
	public void setCaseNo(int caseNo) {
		this.caseNo = caseNo;
	}
	public int getDisbursementId() {
		return disbursementId;
	}
	public void setDisbursementId(int disbursementId) {
		this.disbursementId = disbursementId;
	}
	public Dealer getDealer() {
		return dealer;
	}
	public void setDealer(Dealer dealer) {
		this.dealer = dealer;
	}
	public String getModeOfTransfer() {
		return modeOfTransfer;
	}
	public void setModeOfTransfer(String modeOfTransfer) {
		this.modeOfTransfer = modeOfTransfer;
	}
	public double getPayableLoanAmount() {
		return payableLoanAmount;
	}
	public void setPayableLoanAmount(double payableLoanAmount) {
		this.payableLoanAmount = payableLoanAmount;
	}
	public String getAmountTransferDate() {
		return amountTransferDate;
	}
	public void setAmountTransferDate(String amountTransferDate) {
		this.amountTransferDate = amountTransferDate;
	}
	public CustomerDetails getCustomer() {
		return customer;
	}
	public void setCustomer(CustomerDetails customer) {
		this.customer = customer;
	}
	public String getTypeOfLoan() {
		return typeOfLoan;
	}
	public void setTypeOfLoan(String typeOfLoan) {
		this.typeOfLoan = typeOfLoan;
	}
	
	

}
