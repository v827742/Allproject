package com.cjc.app.fl.master.main.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BankDetails {

	@Id
 private int bankId;
 public int getBankId() {
		return bankId;
	}
	public void setBankId(int bankId) {
		this.bankId = bankId;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	public String getMicrCode() {
		return micrCode;
	}
	public void setMicrCode(String micrCode) {
		this.micrCode = micrCode;
	}
private String bankName;
 private String ifscCode;
 private String micrCode;
}
