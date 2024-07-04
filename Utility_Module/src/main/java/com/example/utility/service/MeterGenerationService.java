package com.example.utility.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.utility.dao.Meter;

@Service
public interface MeterGenerationService {

	void setMeterId(Meter mr);

	List<Meter> getAllMeters();

}
