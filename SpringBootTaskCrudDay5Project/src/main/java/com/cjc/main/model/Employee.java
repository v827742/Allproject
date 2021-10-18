package com.cjc.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	private int empid;
	private String uname;
	private String pass;
	private String name;
	private String addr;
	private String email;
	private String mono;
	private double salary;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}
