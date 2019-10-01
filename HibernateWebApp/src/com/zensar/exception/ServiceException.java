package com.zensar.exception;

public class ServiceException extends Exception {
	
	private String errorMessage;
	
	public ServiceException() {
		errorMessage = "error: service exception";
	}
	

	public ServiceException(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}


	@Override
	public String toString() {
		return "ServiceException [errorMessage=" + errorMessage + "]";
	}
	
	

}
