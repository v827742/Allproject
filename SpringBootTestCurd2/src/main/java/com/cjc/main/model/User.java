package com.cjc.main.model;

public class User {

	private int uid;
	private String uname;
	private String pass;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
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
	private String name;
	private String address;
	private String mono;
}
