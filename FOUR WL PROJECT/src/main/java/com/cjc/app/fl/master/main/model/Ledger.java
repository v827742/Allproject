package com.cjc.app.fl.master.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Ledger {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ledgerId;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Disburse disburse;
	
	@OneToOne(cascade = CascadeType.ALL)
	private BankDetails amountPaidToBank;
	private double totalPaidAmount;
	private double remaningAmount;
	private int tenure;
	private double emiAmount;
	private String lastEmiPaidDate;
	private int remaningEmiTenure;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Loan loan;

	public int getLedgerId() {
		return ledgerId;
	}

	public void setLedgerId(int ledgerId) {
		this.ledgerId = ledgerId;
	}

	public Disburse getDisburse() {
		return disburse;
	}

	public void setDisburse(Disburse disburse) {
		this.disburse = disburse;
	}

	public BankDetails getAmountPaidToBank() {
		return amountPaidToBank;
	}

	public void setAmountPaidToBank(BankDetails amountPaidToBank) {
		this.amountPaidToBank = amountPaidToBank;
	}



	public double getTotalPaidAmount() {
		return totalPaidAmount;
	}

	public void setTotalPaidAmount(double totalPaidAmount) {
		this.totalPaidAmount = totalPaidAmount;
	}

	public double getRemaningAmount() {
		return remaningAmount;
	}

	public void setRemaningAmount(double remaningAmount) {
		this.remaningAmount = remaningAmount;
	}

	public int getTenure() {
		return tenure;
	}

	public void setTenure(int tenure) {
		this.tenure = tenure;
	}

	public double getEmiAmount() {
		return emiAmount;
	}

	public void setEmiAmount(double emiAmount) {
		this.emiAmount = emiAmount;
	}

	public String getLastEmiPaidDate() {
		return lastEmiPaidDate;
	}

	public void setLastEmiPaidDate(String lastEmiPaidDate) {
		this.lastEmiPaidDate = lastEmiPaidDate;
	}

	public int getRemaningEmiTenure() {
		return remaningEmiTenure;
	}

	public void setRemaningEmiTenure(int remaningEmiTenure) {
		this.remaningEmiTenure = remaningEmiTenure;
	}

	public Loan getLoan() {
		return loan;
	}

	public void setLoan(Loan loan) {
		this.loan = loan;
	}
	

}
