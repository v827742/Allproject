package com.cjc.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.NotEmpty;

import net.bytebuddy.implementation.bind.annotation.Empty;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int sid;
    
    @NotBlank
    private String rollno;
    @NotBlank
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
	private String name;
    private String addr;
    private String  mono;
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
	public String getMono() {
		return mono;
	}
	public void setMono(String mono) {
		this.mono = mono;
	}
}
