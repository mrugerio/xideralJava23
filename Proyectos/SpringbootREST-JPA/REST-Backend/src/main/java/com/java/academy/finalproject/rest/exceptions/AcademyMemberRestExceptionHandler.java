package com.java.academy.finalproject.rest.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AcademyMemberRestExceptionHandler {

    // Add an exception handler for EmployeeNotFoundException

    @ExceptionHandler
    public ResponseEntity<AcademyMemberErrorResponse> handleException(AcademyMemberNotFoundException exc) {

        // create EmployeeErrorResponse

        AcademyMemberErrorResponse error = new AcademyMemberErrorResponse(
                HttpStatus.NOT_FOUND.value(),
                exc.getMessage(),
                System.currentTimeMillis());

        // return ResponseEntity

        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

    // Add another exception handler ... to catch any exception (catch all)

    @ExceptionHandler
    public ResponseEntity<AcademyMemberErrorResponse> handleException(Exception exc) {

        // create EmployeeErrorResponse

        AcademyMemberErrorResponse error = new AcademyMemberErrorResponse(
                HttpStatus.BAD_REQUEST.value(),
                exc.getMessage(),
                System.currentTimeMillis());

        // return ResponseEntity

        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }

}
