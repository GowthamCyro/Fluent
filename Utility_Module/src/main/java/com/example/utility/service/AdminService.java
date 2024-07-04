package com.example.utility.service;



import com.example.utility.dao.AdminUser;

public interface AdminService {
	
	AdminUser getUserById(int id);
	void createUser(AdminUser admin);
	AdminUser getUser(int aid);
}
