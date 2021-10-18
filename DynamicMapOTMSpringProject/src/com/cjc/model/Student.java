package com.cjc.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Student {

	@Id
	private int rollno;
	private String name;
	private String mono;
	private String email;
	private String pass;
	
	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	@ManyToOne(cascade=CascadeType.ALL)
	private College clg;

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

	public College getClg() {
		return clg;
	}

	public void setClg(College clg) {
		this.clg = clg;
	}

	

}

