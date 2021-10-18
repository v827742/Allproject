package com.cjc.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {

	@Id
	private int pincode;
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getAreaname() {
		return areaname;
	}
	public void setAreaname(String areaname) {
		this.areaname = areaname;
	}
	public String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	private String areaname;
	private String cityname;
	
}
