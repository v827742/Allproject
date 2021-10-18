package com.cjc.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {
	@Id
    private int aid;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}

	private String cityname;
	private String areaname;
	public String getAreaname() {
		return areaname;
	}
	public void setAreaname(String areaname) {
		this.areaname = areaname;
	}

	private String state;
	
	
}
