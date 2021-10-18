package com.cjc.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
    @Id
	private int eid;
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

	public int getEid() {
		return eid;
	}
	
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEdob() {
		return edob;
	}
	public void setEdob(String edob) {
		this.edob = edob;
	}
	public String getEgender() {
		return egender;
	}
	public void setEgender(String egender) {
		this.egender = egender;
	}
	public long getMono() {
		return mono;
	}
	public void setMono(long mono) {
		this.mono = mono;
	}
	public String getEdesignation() {
		return edesignation;
	}
	public void setEdesignation(String edesignation) {
		this.edesignation = edesignation;
	}
	public String getEaddress() {
		return eaddress;
	}
	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}
	public double getEsalary() {
		return esalary;
	}
	public void setEsalary(double esalary) {
		this.esalary = esalary;
	}
	private String ename;
	private String edob;
	private String egender;
	private long mono;
	private String edesignation;
	private String eaddress;
	private double esalary;
	
	
}
