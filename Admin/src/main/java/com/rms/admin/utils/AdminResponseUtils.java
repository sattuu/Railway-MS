package com.rms.admin.utils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class AdminResponseUtils {

	public static <T> ResponseEntity<T> getResponseEntity(T valueInResponseEntity) {
		return new ResponseEntity<T>(valueInResponseEntity, HttpStatus.OK);
	}
}
