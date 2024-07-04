package com.example.utility.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.utility.dao.feedback;

@Service
public interface FeedBackService {

	String postFeedback(feedback feed);

	List<feedback> findBymeterId(String meterId);

}
