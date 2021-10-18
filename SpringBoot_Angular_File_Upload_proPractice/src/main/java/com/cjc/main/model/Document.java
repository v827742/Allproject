package com.cjc.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Document {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int documentid;
	public int customerid;
	

	public int getDocumentid() {
		return documentid;
	}
	
	public void setDocumentid(int documentid) {
		this.documentid = documentid;
	}
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public byte[] getAddress_proof() {
		return address_proof;
	}
	public void setAddress_proof(byte[] address_proof) {
		this.address_proof = address_proof;
	}
	public byte[] getPhoto() {
		return photo;
	}
	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}
	public byte[] getSignature() {
		return signature;
	}
	public void setSignature(byte[] signature) {
		this.signature = signature;
	}
	public byte[] getThumb() {
		return thumb;
	}
	public void setThumb(byte[] thumb) {
		this.thumb = thumb;
	}
	@Lob
	public byte[] address_proof;
	@Lob
	public byte[] photo;
	@Lob
	public byte[] signature;
	@Lob
	public byte[] thumb;
	
	
}
