package com.example.utility.dao;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Complaints {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String complaint;
	private String response;
	private String meterId;
	private String status;
	
	public String getResponse() {
		return response;
	}
	public void setResponse(String response) {
		this.response = response;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getComplaint() {
		return complaint;
	}
	public void setComplaint(String complaint) {
		this.complaint = complaint;
	}
	public String getMeterId() {
		return meterId;
	}
	public void setMeterId(String meterId) {
		this.meterId = meterId;
	}
	@Override
	public String toString() {
		return "Complaints [id=" + id + ", complaint=" + complaint + ", response=" + response + ", meterId=" + meterId
				+ "]";
	}
	
}

