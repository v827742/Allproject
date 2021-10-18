package com.braindata.bankmanagement.model;

public class Account {
	private int AccNo;
	private String Name;
	private String mobNo;
	private long adharNo;
	private String gender;
	private int age;
	private double balance;
	public int getAccNo() {
		return AccNo;
	}
	public void setAccNo(int accNo) {
		AccNo = accNo;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getMobNo() {
		return mobNo;
	}
	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}
	public long getAdharNo() {
		return adharNo;
	}
	public void setAdharNo(long s) {
		this.adharNo = s;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	}
