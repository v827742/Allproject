package com.cjc.main.model;

public class Employee {
	
	private int eid;
	
	private String name;
	private String uname;
	private String pass;

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	private String address;
	
	private String mono;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMono() {
		return mono;
	}

	public void setMono(String mono) {
		this.mono = mono;
	}
	


}
