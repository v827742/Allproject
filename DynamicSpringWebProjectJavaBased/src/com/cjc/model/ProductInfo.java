package com.cjc.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ProductInfo {
     @Id
	private int pid;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPbrand() {
		return pbrand;
	}
	public void setPbrand(String pbrand) {
		this.pbrand = pbrand;
	}
	public String getPkgdate() {
		return pkgdate;
	}
	public void setPkgdate(String pkgdate) {
		this.pkgdate = pkgdate;
	}
	public String getExpdate() {
		return expdate;
	}
	public void setExpdate(String expdate) {
		this.expdate = expdate;
	}
	public String getMrp() {
		return mrp;
	}
	public void setMrp(String mrp) {
		this.mrp = mrp;
	}
	private String pname;
	private String pbrand;
	private String pkgdate;
	private String expdate;
	private String mrp;
}
