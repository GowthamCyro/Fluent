package com.example.utility.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.utility.dao.Consumer;
import com.example.utility.repository.consumerRepo;
import com.example.utility.service.consumerService;

@RestController
public class ConsumerController {
	
	
	@Autowired
	private consumerRepo crepo;
	
	@Autowired
	consumerService service;

	@GetMapping("/consumers/{meterId}")
	public Optional<Consumer> get(@PathVariable String meterId)
	{
		return service.getConsumerDetails(meterId);
	}
	
	@PostMapping("/postConsumers")
	public void postConsumerData(@RequestBody Consumer cr)
	{
		service.postConsumerDetails(cr);
	}
	
}
