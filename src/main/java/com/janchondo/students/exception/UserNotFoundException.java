package com.janchondo.students.exception;

public class UserNotFoundException extends RuntimeException {

	public UserNotFoundException(Long id) {
		super(String.format("User with ID %d not found", id));
	}
}
