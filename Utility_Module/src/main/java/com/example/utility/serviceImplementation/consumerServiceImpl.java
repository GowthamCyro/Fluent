package com.example.utility.serviceImplementation;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.utility.dao.Consumer;
import com.example.utility.repository.consumerRepo;
import com.example.utility.service.consumerService;


@Service
public class consumerServiceImpl implements consumerService{
	
	
	@Autowired
	consumerRepo repo;

	@Override
	public Optional<Consumer> getConsumerDetails(String meterId) {
		
		return repo.findByMeterId(meterId);
	}

	@Override
	public void postConsumerDetails(Consumer cr) {
		repo.save(cr);
	}

}
