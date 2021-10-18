package com.cjc.app.fl.master.main.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Loan {
	@Id
	private  int loanid;
	public int getLoanid() {
		return loanid;
	}
	public void setLoanid(int loanid) {
		this.loanid = loanid;
	}
	public Double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(Double loanAmount) {
		this.loanAmount = loanAmount;
	}
	public float getRateOfInterest() {
		return rateOfInterest;
	}
	public void setRateOfInterest(float rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}
	public Double getEmiMonthly() {
		return emiMonthly;
	}
	public void setEmiMonthly(Double emiMonthly) {
		this.emiMonthly = emiMonthly;
	}
	public Double getTotalEMI() {
		return totalEMI;
	}
	public void setTotalEMI(Double totalEMI) {
		this.totalEMI = totalEMI;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	private Double loanAmount;
	private float rateOfInterest;
	private Double emiMonthly;
	private Double totalEMI;
	private int duration;

}
