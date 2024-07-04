package com.example.utility.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.utility.dao.Meter;

import jakarta.transaction.Transactional;

public interface MeterRepo extends JpaRepository<Meter, Integer>{
	

}
