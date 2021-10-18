package com.cjc.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Student {
    @Id
	private int stuid;
	private String name;
	private String email;
	private long mono;
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

	@OneToOne(cascade = CascadeType.ALL)
	private Address addr;

	public int getStuid() {
		return stuid;
	}

	public void setStuid(int stuId) {
		this.stuid = stuId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMono() {
		return mono;
	}

	public void setMono(long mono) {
		this.mono = mono;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}
	
}
