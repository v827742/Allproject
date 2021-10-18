package com.cjc.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
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
    private String DOB;
    private String email;
    private String mono;
    public String getMono() {
		return mono;
	}
	public void setMono(String mono) {
		this.mono = mono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
    public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getDOB() {
		return DOB;
	
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
	
	
}