package com.example.utility.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.utility.dao.ConnectionRequest;
import com.example.utility.dao.Meter;

@Service
public interface NewConnectionService {
	List<ConnectionRequest> getAllData();
	void postData(ConnectionRequest cr);
	void updateStatusValue(int entityId, String newValue);
	void updateMeter(ConnectionRequest cr);
	
}
