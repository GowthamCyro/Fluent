package com.example.utility.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.utility.dao.feedback;
import com.example.utility.repository.feedbackRepo;
import com.example.utility.service.FeedBackService;


@RestController
public class feedbackController {
	
	@Autowired
	FeedBackService service;
	
	@Autowired
	feedbackRepo repo;
	
	@PostMapping("/consumers/feedback")
	public String post(@RequestBody feedback feed) {
		return service.postFeedback(feed);
	}
	
	@GetMapping("/consumers/feedback/{meterId}")
	public List<feedback> getfeedbacks(@PathVariable String meterId){
		return service.findBymeterId(meterId);
	}
	
}
