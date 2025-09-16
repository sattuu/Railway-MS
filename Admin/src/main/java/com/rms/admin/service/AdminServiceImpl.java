package com.rms.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rms.admin.entity.AdminEntityMW;
import com.rms.admin.repository.AdminRepositoty;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	AdminRepositoty adminRepo;

	@Override
	public void createAdmin(String name) {
		AdminEntityMW admin = new AdminEntityMW(name);
		adminRepo.save(admin);

	}

	@Override
	public boolean adminLogin(String userName, String password) {
		// TODO Auto-generated method stub
		return false;
	}

}
