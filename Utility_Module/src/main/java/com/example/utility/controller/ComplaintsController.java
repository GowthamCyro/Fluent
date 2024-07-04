package com.example.utility.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.utility.dao.Complaints;
import com.example.utility.service.ComplaintsService;

@RestController
public class ComplaintsController {
	
	@Autowired
	ComplaintsService service;
	
	@GetMapping("/getComplaints")
	public List<Complaints> gettingComplaints()
	{
		return service.getAllComplaints();
	}
	
	@PostMapping("/postComplaints")
	public void postingComplaints(@RequestBody Complaints cp)
	{
		service.postAllComplaints(cp);
	}
	
	@PutMapping("/resolve")
	public void resolving(@RequestBody Complaints cp)
	{
		service.putResolve(cp);
	}
	
	@GetMapping("/complaints/{id}")
	public Complaints getComplaint(@PathVariable int id) {
		return service.findingById(id);
	}
	
	@GetMapping("/complaints/meter/{meterId}")
	public List<Complaints> getComplaintMeterIds(@PathVariable String meterId) {
		return service.findingByMeterId(meterId);
	}

}
