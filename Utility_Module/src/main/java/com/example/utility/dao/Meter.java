package com.example.utility.dao;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.UniqueConstraint;

@Entity
public class Meter {
	
	@Id
	private int mid;
	
	@Column(unique = true)
	private String MeterNumber;
		
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMeterNumber() {
		return MeterNumber;
	}
	public void setMeterNumber(String meterNumber) {
		MeterNumber = meterNumber;
	}
	@Override
	public String toString() {
		return "Meter [mid=" + mid + ", MeterNumber=" + MeterNumber + "]";
	}
}
