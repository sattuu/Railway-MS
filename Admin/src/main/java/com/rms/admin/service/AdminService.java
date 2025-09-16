package com.rms.admin.service;

public interface AdminService {

	void createAdmin(String name);

	boolean adminLogin(String userName, String password);

}
