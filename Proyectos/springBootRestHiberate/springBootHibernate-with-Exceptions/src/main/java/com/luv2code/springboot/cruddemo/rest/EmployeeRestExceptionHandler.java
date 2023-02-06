package com.luv2code.springboot.cruddemo.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class EmployeeRestExceptionHandler {
	
	@ExceptionHandler
	public ResponseEntity<EmployeeErrorResponse> handleException(EmployeeNotFoundException exc) {
		
		
		EmployeeErrorResponse error = new EmployeeErrorResponse(
											HttpStatus.NOT_FOUND.value(),
											exc.getMessage(),
											System.currentTimeMillis());
		
		// return ResponseEntity
		
		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	}
	
	

	@ExceptionHandler
	public ResponseEntity<EmployeeErrorResponse> handleException(Exception exc) {
		
		// create CustomerErrorResponse
		
		EmployeeErrorResponse error = new EmployeeErrorResponse(
											HttpStatus.BAD_REQUEST.value(),
											exc.getMessage(),
											System.currentTimeMillis());
		
		// return ResponseEntity
		
		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
	}
	
}





