package com.cjc.model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class College {
	@Id
	private int cid;
	private String cname;
	private String caddr;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCaddr() {
		return caddr;
	}
	public void setCaddr(String caddr) {
		this.caddr = caddr;
	}
	
	
	
	
	
	
}