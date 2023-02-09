package com.java.academy.finalproject.rest.exceptions;

public class AcademyMemberNotFoundException extends RuntimeException {

	public AcademyMemberNotFoundException() {
	}

	public AcademyMemberNotFoundException(String message) {
		super(message);
	}

	public AcademyMemberNotFoundException(Throwable cause) {
		super(cause);
	}

	public AcademyMemberNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public AcademyMemberNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
