package com.cjc.app.fl.master.main.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Dealer {
    @Id
	private int did;
	private String dName;
	
	@OneToOne(cascade = CascadeType.ALL)
	private BankDetails dBankDetails;
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
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
