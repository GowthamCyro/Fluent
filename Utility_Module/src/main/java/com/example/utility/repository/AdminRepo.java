package com.example.utility.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.utility.dao.AdminUser;

@Repository
public interface AdminRepo extends JpaRepository<AdminUser, Integer>{
	AdminUser findByAid(int aid);
}
