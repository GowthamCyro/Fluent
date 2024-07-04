package com.example.utility.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.utility.dao.ConnectionRequest;
import com.example.utility.dao.Meter;
import com.example.utility.repository.ConnReq;
import com.example.utility.service.NewConnectionService;

@RestController
public class NewServiceConnectionController {
	
	@Autowired
	NewConnectionService serv;
	
	@GetMapping("/getAllRequests")
	public List<ConnectionRequest> home()
	{
		return serv.getAllData();
	}
	
	
	@PostMapping("/postData")
	public void posting(@RequestBody ConnectionRequest cr)
	{
		serv.postData(cr);
	}

	
	
	@PutMapping("/updation")
	public void updatingStatus(@RequestBody ConnectionRequest cr)
	{
		serv.updateStatusValue(cr.getRequestid(), cr.getStatus());
	}
	
	@PutMapping("/updatingMeter")
	public void updatingMeter(@RequestBody ConnectionRequest cr)
	{
		serv.updateMeter(cr);
	}
	
	
}
