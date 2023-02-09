package com.java.academy.finalproject.rest.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AcademyMemberErrorResponse {

	private int status;
	private String message;
	private long timeStamp;

}
