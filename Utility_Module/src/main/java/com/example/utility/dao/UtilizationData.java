package com.example.utility.dao;

import java.time.LocalDate;
import java.time.Month;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UtilizationData {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String meterId;
	private String Status;
	private String Consumption;
	private int bill;
	private Month month;
	private LocalDate date;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Month getMonth() {
		return month;
	}
	public void setMonth(Month month) {
		this.month = month;
	}
	
	public String getMeterId() {
		return meterId;
	}
	public void setMeterId(String meterId) {
		this.meterId = meterId;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	
	public String getConsumption() {
		return Consumption;
	}
	public void setConsumption(String consumption) {
		Consumption = consumption;
	}
	public int getBill() {
		return bill;
	}
	public void setBill(int bill) {
		this.bill = bill;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "UtilizationData [MeterId=" + meterId + ", Status=" + Status + ", Consumption=" + Consumption + ", bill="
				+ bill + ", month=" + month + ", date=" + date + "]";
	}
	
}
