package com.example.utility.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.utility.dao.Complaints;

public interface ComplaintsRepo extends JpaRepository<Complaints, Integer>{
	
	Complaints findById(int id);
	
	List<Complaints> findByMeterId(String meterId);

}
