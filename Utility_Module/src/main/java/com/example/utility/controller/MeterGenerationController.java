package com.example.utility.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.utility.dao.Meter;
import com.example.utility.service.MeterGenerationService;

@RestController
public class MeterGenerationController {
	
	@Autowired
	MeterGenerationService service;
	
	@PostMapping("/MeterIdGenerator")
	public void MeterIdGeneration(@RequestBody Meter mr)
	{
		service.setMeterId(mr);
	}
	
	@GetMapping("/getAllMeters")
	public List<Meter> findMeters()
	{
		return service.getAllMeters();
	}
	

}
