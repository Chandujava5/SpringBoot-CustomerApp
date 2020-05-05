package com.abc.customer.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
	@Id
	@Column
	private int id;
	@Column
	private String cname;
	@Column
	private long phoneNo;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int id, String cname, long phoneNo) {
		super();
		this.id = id;
		this.cname = cname;
		this.phoneNo = phoneNo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", cname=" + cname + ", phoneNo=" + phoneNo + "]";
	}

}
