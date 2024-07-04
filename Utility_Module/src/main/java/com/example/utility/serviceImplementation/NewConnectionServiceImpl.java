package com.example.utility.serviceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.utility.dao.ConnectionRequest;
import com.example.utility.dao.Meter;
import com.example.utility.repository.ConnReq;
import com.example.utility.service.NewConnectionService;


@Service
public class NewConnectionServiceImpl implements NewConnectionService{
	
	@Autowired
	ConnReq conn;

	@Override
	public List<ConnectionRequest> getAllData() {
		return conn.findAll();
	}

	@Override
	public void postData(ConnectionRequest cr) {
		conn.save(cr);
	}

	@Override
	public void updateStatusValue(int entityId, String newValue) {
		conn.updateStatusById(entityId, newValue);
		
	}

	@Override
	public void updateMeter(ConnectionRequest cr) {
		conn.save(cr);
	}

}
