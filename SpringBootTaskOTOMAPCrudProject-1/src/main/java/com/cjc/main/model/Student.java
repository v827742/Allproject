package com.cjc.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Student {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int rollno;
    private String uname;
    private String pass;
    private String name;
    private String gender;
    private String addr;
    private String DOB;
    public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	private String email;
    private String mono;
    @OneToOne(cascade = CascadeType.ALL)
    private College clg;
    public College getClg() {
		return clg;
	}
	public void setClg(College clg) {
		this.clg = clg;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMono() {
		return mono;
	}
	public void setMono(String mono) {
		this.mono = mono;
	}
	
}
