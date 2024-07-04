package com.example.utility.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.utility.dao.Complaints;


@Service
public interface ComplaintsService {

	List<Complaints> getAllComplaints();

	void postAllComplaints(Complaints cp);

	void putResolve(Complaints cp);

	Complaints findingById(int id);

	List<Complaints> findingByMeterId(String meterId);

}
