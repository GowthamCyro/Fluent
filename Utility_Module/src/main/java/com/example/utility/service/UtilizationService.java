package com.example.utility.service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.utility.dao.UtilizationData;

@Service
public interface UtilizationService {

	List<UtilizationData> getAllMeterData();

	void postMeteData(UtilizationData ud);

	UtilizationData findOut(LocalDate date, String meterId);

	List<UtilizationData> findByMonth(Month month, String meterId);

}
