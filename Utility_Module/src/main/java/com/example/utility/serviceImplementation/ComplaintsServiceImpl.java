package com.example.utility.serviceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.utility.dao.Complaints;
import com.example.utility.repository.ComplaintsRepo;
import com.example.utility.service.ComplaintsService;


@Service
public class ComplaintsServiceImpl implements ComplaintsService{
	
	@Autowired
	ComplaintsRepo repo;

	@Override
	public List<Complaints> getAllComplaints() {
		return repo.findAll();
	}

	@Override
	public void postAllComplaints(Complaints cp) {
		repo.save(cp);
		
	}

	@Override
	public void putResolve(Complaints cp) {
		repo.save(cp);
		
	}

	@Override
	public Complaints findingById(int id) {
		return repo.findById(id);
	}

	@Override
	public List<Complaints> findingByMeterId(String meterId) {
		
		return repo.findByMeterId(meterId);
	}

}
