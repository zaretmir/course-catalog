package com.zaretmir.catalog.exception;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;

@Getter
@Setter
public class ApiError {
	
	private HttpStatus status;

	private LocalDateTime timestamp;
	private String message;	// User-friendly error message
	private String debugMessage; // Detailed error message
	private List<ApiSubError> subErrors;
	
	public ApiError() {
		this.timestamp = LocalDateTime.now();
	}
	
	
	ApiError(HttpStatus status) {
		this();
		this.status = status;
	}
	
	ApiError(HttpStatus status, Throwable ex) {
		this();
		this.status = status;
		this.message = "Unexpected error";
		this.debugMessage = ex.getLocalizedMessage();
	}
	
	ApiError(HttpStatus status, String message, Throwable ex) {
		this();
		this.status = status;
		this.message = message;
		this.debugMessage = ex.getLocalizedMessage();
	}
	
	private void addSubError(ApiSubError subError) {
		if (subErrors == null) {
			subErrors = new ArrayList<ApiSubError>();
		}		
		subErrors.add(subError);
	}
	
	
	public void addValidationErrors(List<FieldError> fieldErrors) {
		fieldErrors.forEach(this::addValidationError);
		
	}
	
	private void addValidationError(FieldError fieldError) {
		ApiValidationError validationError = new ApiValidationError(
				fieldError.getObjectName(),
				fieldError.getField(),
				fieldError.getRejectedValue(),
				fieldError.getDefaultMessage());
		addSubError(validationError);
	}
}
