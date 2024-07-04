package com.example.utility.repository;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.utility.dao.UtilizationData;

public interface UtilizationRepo extends JpaRepository<UtilizationData, Integer> {
	UtilizationData findByDateAndMeterId(LocalDate date, String meterId);
	List<UtilizationData> findByMonthAndMeterId(Month month, String meterId);

}
