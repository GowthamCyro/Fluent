package com.example.utility.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.utility.dao.feedback;

public interface feedbackRepo extends JpaRepository<feedback, Integer> {
	
	List<feedback> findByMeterId(String meterId);

}
