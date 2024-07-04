package com.example.utility.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.utility.dao.Consumer;

@Service
public interface consumerService {

	Optional<Consumer> getConsumerDetails(String meterId);

	void postConsumerDetails(Consumer cr);

}
