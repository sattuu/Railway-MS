package com.rms.admin.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class AdminUtils {

	@Autowired
	private static PasswordEncoder encoder = new BCryptPasswordEncoder();

	public static String encodePassword(String unEncryptedPassword) {
		String encryptedPassword = encoder.encode(unEncryptedPassword);
		return encryptedPassword;
	}

	public static boolean verifyPassword(String password, String encryptedPassword) {
		boolean isSamePassword = encoder.matches(encryptedPassword, password);
		return isSamePassword;
	}

}
