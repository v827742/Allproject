package com.cjc.app.fl.master.main.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class UpdateLedger {

	@Id
	private int ledgerUpdateId;
	@OneToOne(cascade = CascadeType.ALL)
	private Ledger ledger;
	private Double remainngPaidAmount;
	private int tenure;
	private Double emiAmount;
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
	public Double getRemainngPaidAmount() {
		return remainngPaidAmount;
	}
	public void setRemainngPaidAmount(Double remainngPaidAmount) {
		this.remainngPaidAmount = remainngPaidAmount;
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
	public int getDefaultEmi() {
		return defaultEmi;
	}
	public void setDefaultEmi(int defaultEmi) {
		this.defaultEmi = defaultEmi;
	}
}
