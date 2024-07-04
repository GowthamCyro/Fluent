package com.example.utility.dao;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class AdminUser {
	@Id
	private int aid;
	
	@Column(unique = true)
	private String aname;
	
	private String apass;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	
	public String getApass() {
		return apass;
	}
	public void setApass(String apass) {
		this.apass = apass;
	}
	@Override
	public String toString() {
		return "AdminUser [aid=" + aid + ", aname=" + aname + ", apass=" + apass + "]";
	}
	
}
