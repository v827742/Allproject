package com.cjc.app.fl.master.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class UpdateLedger {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ledgerUpdateId;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Ledger ledger;
	private double remaningAmount;
	private int tenure;
	private double emiAmount;
	private int defaultEmi;
	
	public int getLedgerUpdateId() {
		return ledgerUpdateId;
	}
	public void setLedgerUpdateId(int ledgerUpdateId) {
		this.ledgerUpdateId = ledgerUpdateId;
	}
	public Ledger getLedger() {
		return ledger;
	}
	public void setLedger(Ledger ledger) {
		this.ledger = ledger;
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
	public int getDefaultEmi() {
		return defaultEmi;
	}
	public void setDefaultEmi(int defaultEmi) {
		this.defaultEmi = defaultEmi;
	}

}
