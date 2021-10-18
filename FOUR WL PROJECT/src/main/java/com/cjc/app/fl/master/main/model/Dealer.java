package com.cjc.app.fl.master.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Dealer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private int dId;
	private String dName;
	
	@OneToOne(cascade = CascadeType.ALL)
	private BankDetails dBankDetails;



	public int getdId() {
		return dId;
	}

	public void setdId(int dId) {
		this.dId = dId;
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	public BankDetails getdBankDetails() {
		return dBankDetails;
	}

	public void setdBankDetails(BankDetails dBankDetails) {
		this.dBankDetails = dBankDetails;
	}

}
