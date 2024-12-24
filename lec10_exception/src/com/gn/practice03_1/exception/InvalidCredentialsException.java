package com.gn.practice03_1.exception;

public class InvalidCredentialsException extends Exception{
	public InvalidCredentialsException() {}
	public InvalidCredentialsException(String msg) {
		super(msg);
	}
	
}
