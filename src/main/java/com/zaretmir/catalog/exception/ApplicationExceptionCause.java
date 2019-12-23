package com.zaretmir.catalog.exception;

import java.io.Serializable;

import org.springframework.http.HttpStatus;

public interface ApplicationExceptionCause {
	
	String getCode();
	HttpStatus getHttpStatus();
}
