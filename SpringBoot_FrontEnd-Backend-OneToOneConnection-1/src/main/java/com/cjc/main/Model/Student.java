package com.cjc.main.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.OneToOne;

@Entity
public class Student {

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
		private int stuid;
		public int getStuid() {
		return stuid;
	}


	public void setStuid(int stuid) {
		this.stuid = stuid;
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


	public Address getAddr() {
		return addr;
	}


	public void setAddr(Address addr) {
		this.addr = addr;
	}


		private String name;
		private String email;
		private long mono;
		private String uname;
		private String pass;
		
		
		@OneToOne(cascade = CascadeType.ALL)
		private Address addr;
}
