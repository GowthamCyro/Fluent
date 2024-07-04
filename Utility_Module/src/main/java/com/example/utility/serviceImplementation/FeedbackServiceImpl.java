package com.example.utility.serviceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.utility.dao.feedback;
import com.example.utility.repository.feedbackRepo;
import com.example.utility.service.FeedBackService;

@Service
public class FeedbackServiceImpl implements FeedBackService{
	
	@Autowired
	feedbackRepo repo;

	@Override
	public String postFeedback(feedback feed) {
		repo.save(feed);
		return "posted";
	}

	@Override
	public List<feedback> findBymeterId(String meterId) {
		return repo.findByMeterId(meterId);
	}

}
