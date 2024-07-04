package com.example.utility.serviceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.utility.dao.Meter;
import com.example.utility.repository.MeterRepo;
import com.example.utility.service.MeterGenerationService;


@Service
public class MeterGenerationServiceImpl implements MeterGenerationService{
	
	@Autowired
	MeterRepo repo;

	@Override
	public void setMeterId(Meter mr) {
		repo.save(mr);
	}

	@Override
	public List<Meter> getAllMeters() {
		
		return repo.findAll();
	}

}
