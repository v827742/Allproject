package com.cjc.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;



@Entity
public class Student {
    @Id
	private int rollno;
    @NotBlank(message = "it should not Empty")
	private String name;
	private String uname;
	@NotBlank
    @Size(min = 8, max = 15)
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
	@NotBlank
	private String addr;
	@NotBlank
	private String gender;
	
	private String DOB;
	@NotBlank
	private String mobNo;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getMobNo() {
		return mobNo;
	}
	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}
}
