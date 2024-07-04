package com.example.utility.serviceImplementation;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.utility.dao.UtilizationData;
import com.example.utility.repository.UtilizationRepo;
import com.example.utility.service.UtilizationService;

@Service
public class UtilizationServiceImpl implements UtilizationService{
	
	
	@Autowired
	UtilizationRepo repo;

	@Override
	public List<UtilizationData> getAllMeterData() {
		return repo.findAll();
	}

	@Override
	public void postMeteData(UtilizationData ud) {
		LocalDate date =  ud.getDate();
		Month month = date.getMonth();
		ud.setMonth(month);
		repo.save(ud);
	}

	@Override
	public UtilizationData findOut(LocalDate date, String meterId) {
		return repo.findByDateAndMeterId(date, meterId);
	}

	@Override
	public List<UtilizationData> findByMonth(Month month, String meterId) {
		return repo.findByMonthAndMeterId(month,meterId);
	}
	
	

}
