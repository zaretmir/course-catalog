package com.zaretmir.catalog.exception;

import org.springframework.http.HttpStatus;

public enum InstructorExceptionCause implements ApplicationExceptionCause {
    NOT_FOUND("No instructors found", HttpStatus.NOT_FOUND);

    private String code;
    private HttpStatus status;

    @Override
    public String getCode() {
        return this.code;
    }

    @Override
    public HttpStatus getHttpStatus() {
        return this.status;
    }

    InstructorExceptionCause(String code, HttpStatus status) {
        this.code = code;
        this.status = status;
    }
}
