package com.rms.user.utils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class UserResponseUtils {

	public static <T> ResponseEntity<T> getResponseEntity(T valueInResponseEntity) {
		return new ResponseEntity<T>(valueInResponseEntity, HttpStatus.OK);
	}

}
