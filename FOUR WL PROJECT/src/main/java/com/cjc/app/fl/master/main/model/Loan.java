package com.cjc.app.fl.master.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Loan {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int loanId;
	private double loanAmount;
	private float rateOfInterest;
	private double emiMonthly;
	private int numberOfEMI;
	private int duration;
	
	public int getLoanId() {
		return loanId;
	}
	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	public float getRateOfInterest() {
		return rateOfInterest;
	}
	public void setRateOfInterest(float rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}
	public double getEmiMonthly() {
		return emiMonthly;
	}
	public void setEmiMonthly(double emiMonthly) {
		this.emiMonthly = emiMonthly;
	}
	public int getNumberOfEMI() {
		return numberOfEMI;
	}
	public void setNumberOfEMI(int numberOfEMI) {
		this.numberOfEMI = numberOfEMI;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	

	
	

}
