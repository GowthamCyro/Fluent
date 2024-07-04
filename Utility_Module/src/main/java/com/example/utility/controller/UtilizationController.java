package com.example.utility.controller;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.utility.dao.UtilizationData;
import com.example.utility.service.UtilizationService;

@RestController
public class UtilizationController {
	
	@Autowired
	UtilizationService service;

	
	@GetMapping("/meterData")
	public List<UtilizationData> getUtilizationData()
	{
		return service.getAllMeterData();
	}
	
	@PostMapping("/postmeterData")
	public void MetrData(@RequestBody UtilizationData ud)
	{
		service.postMeteData(ud);
	}
	
	@GetMapping("/billing/dates/{date}/{MeterId}")
	public UtilizationData getConsumption(@PathVariable LocalDate date, @PathVariable String MeterId) {
	    return service.findOut(date, MeterId);
	}
	
	@GetMapping("/dates/{month}/{meterId}")
	public List<UtilizationData> getRecords(@PathVariable Month month, @PathVariable String meterId) {
		return service.findByMonth(month, meterId);
	}
	
}
