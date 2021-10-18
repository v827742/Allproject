package com.cjc.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class OrderInfo {
    @Id
	private int oid;
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getMono() {
		return mono;
	}
	public void setMono(String mono) {
		this.mono = mono;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	private String cname;
	private String mono;
	private String addr;
	
}
