package com.dark.mode.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
public class ResourceNotAcceptableException extends RuntimeException {

    private final String fieldName;
    private final Object fieldValue;

    public ResourceNotAcceptableException(String fieldName, Object fieldValue) {
        super(String.format("operation not allowed here with %s : %s", fieldName, fieldValue));
        this.fieldName = fieldName;
        this.fieldValue = fieldValue;
    }

    public String getFieldName() {
        return fieldName;
    }

    public Object getFieldValue() {
        return fieldValue;
    }

}