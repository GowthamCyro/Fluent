package com.example.utility.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.utility.dao.ConnectionRequest;
import com.example.utility.dao.Meter;

import jakarta.transaction.Transactional;

@Repository
public interface ConnReq extends JpaRepository<ConnectionRequest, Integer>{
	
	@Transactional
    @Modifying
    @Query("UPDATE ConnectionRequest e SET e.Status = :newValue WHERE e.requestid = :entityId")
    void updateStatusById(int entityId, String newValue);
}
