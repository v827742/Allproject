package com.cjc.main.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Customer {
    public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	@Id
    
	private int id;
	private String cname;
	private String email;
	private String gender;
	private long mobilNo;
	
	@OneToMany(targetEntity = Product.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "cp_fk",referencedColumnName =  "id")
	private List<Product> products;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String name) {
		this.cname = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getMobilNo() {
		return mobilNo;
	}
	public void setMobilNo(long mobilNo) {
		this.mobilNo = mobilNo;
	}
	
}
