package com.example.utility.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class ConnectionRequest {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int requestid;
	private String Name;
	private String Address;
	private String Status;
	private String Password;
	
	
	
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}

	@OneToOne
	private Meter meter;
	
	public int getRequestid() {
		return requestid;
	}
	public Meter getMeter() {
		return meter;
	}
	public void setMeter(Meter meter) {
		this.meter = meter;
	}
	public void setRequestid(int requestid) {
		this.requestid = requestid;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	
	@Override
	public String toString() {
		return "ConnectionRequest [requestid=" + requestid + ", Name=" + Name + ", Address=" + Address + ", Status="
				+ Status + "]";
	}
	
}
