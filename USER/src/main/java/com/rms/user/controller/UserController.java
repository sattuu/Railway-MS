package com.rms.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rms.user.entity.UserEntity;
import com.rms.user.service.UserService;
import com.rms.user.utils.UserResponseUtils;

@RestController("/user")
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping("/login/{username}/{password}")
	public ResponseEntity<String> loginUser(@PathVariable(name = "username") String username,
			@PathVariable String passowrd) {
		return UserResponseUtils.getResponseEntity("");
	}

	@GetMapping("/checkForUsername/{username}")
	public String userNameExists(@PathVariable String username) {
		return "";
	}

	@PostMapping("/signUp")
	public String createUser(UserEntity user) {
		return "";
	}

	@PutMapping("/updateUser")
	public String updateUserDetails(UserEntity user) {

		return "";

	}

}
