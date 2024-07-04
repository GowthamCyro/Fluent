package com.example.utility.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.utility.dao.AdminUser;
import com.example.utility.repository.AdminRepo;
import com.example.utility.service.AdminService;


@RestController
public class MainUtilityController {
	
	@Autowired 
	AdminRepo arepo;

	@Autowired
	AdminService svr;
	
	@PostMapping("/postNewAdmin")
	public void postNewAdmin(@RequestBody AdminUser admin)
	{
		svr.createUser(admin);
	}
	
	@GetMapping("/getAdmin/{aid}")
	public AdminUser getAdmin(@PathVariable int aid)
	{
		return svr.getUser(aid);
	}
	
	
	
}
