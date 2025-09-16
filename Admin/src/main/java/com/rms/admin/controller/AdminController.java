package com.rms.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.rms.admin.service.AdminService;
import com.rms.admin.utils.JWTUtils;
import com.rms.admin.utils.AdminResponseUtils;

@RestController("/admin")
public class AdminController {

	@Autowired
	AdminService adminService;

	@GetMapping("/hello")
	public String method() {
		return "Hello from method";
	}

	@GetMapping("/name/{name}")
	public String createAdmin(@PathVariable String name, @RequestHeader String token) {
		adminService.createAdmin(name);
		return name;
	}

	@GetMapping("/login/{adminUsername}/{pass}")
	public ResponseEntity<Boolean> verifyAdmin(@PathVariable(value = "adminUsername") String userName,
			@PathVariable(value = "pass") String password, @RequestHeader("Authorization") String token) {

		JWTUtils.validateToken(token);

		boolean loginAllowed = adminService.adminLogin(userName, password);
		return AdminResponseUtils.getResponseEntity(loginAllowed);
	}

}
