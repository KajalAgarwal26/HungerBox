package com.hcl.ing.hungerbox.exception;

public class DeleteItemException extends RuntimeException {
private static final long serialVersionUID = 1L;
	
	@SuppressWarnings("unused")
	private final String message;
	
	public DeleteItemException(String message) {
		super(message);
		this.message=message;
	}
}
