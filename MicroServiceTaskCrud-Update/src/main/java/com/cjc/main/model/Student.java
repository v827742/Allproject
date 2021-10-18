package com.cjc.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	private int sid;
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
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getRollno() {
		return rollno;
	}
	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public long getMono() {
		return mono;
	}
	public void setMono(long mono) {
		this.mono = mono;
	}
	private String rollno;
	private String name;
	private String addr;
	private long mono;
	

}
