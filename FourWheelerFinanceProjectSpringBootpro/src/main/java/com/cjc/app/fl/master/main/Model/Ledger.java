package com.cjc.app.fl.master.main.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Ledger {
    @Id
	private int ledgerId;
    @OneToOne(cascade = CascadeType.ALL)
	private Disburse disburse;
	
	@OneToOne(cascade = CascadeType.ALL)
	private BankDetails amountPaidToBank;
	private Double totalPaidAmount;
	private Double remainingPaidAmount;
	private int tenure;
	private Double emiAmount;
	private String lastEmiPaidDate;
	private int remainingEmiTenure;
	
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
	public Double getTotalPaidAmount() {
		return totalPaidAmount;
	}
	public void setTotalPaidAmount(Double totalPaidAmount) {
		this.totalPaidAmount = totalPaidAmount;
	}
	public Double getRemainingPaidAmount() {
		return remainingPaidAmount;
	}
	public void setRemainingPaidAmount(Double remainingPaidAmount) {
		this.remainingPaidAmount = remainingPaidAmount;
	}
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	public Double getEmiAmount() {
		return emiAmount;
	}
	public void setEmiAmount(Double emiAmount) {
		this.emiAmount = emiAmount;
	}
	public String getLastEmiPaidDate() {
		return lastEmiPaidDate;
	}
	public void setLastEmiPaidDate(String lastEmiPaidDate) {
		this.lastEmiPaidDate = lastEmiPaidDate;
	}
	public int getRemainingEmiTenure() {
		return remainingEmiTenure;
	}
	public void setRemainingEmiTenure(int remainingEmiTenure) {
		this.remainingEmiTenure = remainingEmiTenure;
	}
	public Loan getLoan() {
		return loan;
	}
	public void setLoan(Loan loan) {
		this.loan = loan;
	}
}
