package com.example.utility.serviceImplementation;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.utility.dao.AdminUser;
import com.example.utility.repository.AdminRepo;
import com.example.utility.service.AdminService;

@Service
public class AdminServiceImplementation implements AdminService {
	
	@Autowired
	AdminRepo arepo;

	@Override
	public AdminUser getUserById(int id) {
		AdminUser usr = arepo.findByAid(id);
		return usr;
	}

	@Override
	public void createUser(AdminUser admin) {
		arepo.save(admin);
	}

	@Override
	public AdminUser getUser(int aid) {
		AdminUser usr = arepo.findByAid(aid);
		return usr;
	}	
	
	
}
