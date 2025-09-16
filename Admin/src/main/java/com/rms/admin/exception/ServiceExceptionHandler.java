package com.rms.admin.exception;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ServiceExceptionHandler {

	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> exceptionhandler(Exception e) {
		return new ResponseEntity<String>("Exception" + e.toString(), HttpStatusCode.valueOf(500));
	}

}
