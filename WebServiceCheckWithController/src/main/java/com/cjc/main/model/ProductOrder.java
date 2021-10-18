package com.cjc.main.model;


public class ProductOrder {

	private int poid;
	private String custname;
	public int getPoid() {
		return poid;
	}
	public void setPoid(int poid) {
		this.poid = poid;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPexpdate() {
		return pexpdate;
	}
	public void setPexpdate(String pexpdate) {
		this.pexpdate = pexpdate;
	}
	public String getPmfgdate() {
		return pmfgdate;
	}
	public void setPmfgdate(String pmfgdate) {
		this.pmfgdate = pmfgdate;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	private String pname;
	private String pexpdate;
	private String pmfgdate;
	private double price;
}
