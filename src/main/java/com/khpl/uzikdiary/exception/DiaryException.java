package com.khpl.uzikdiary.exception;

import org.springframework.http.HttpStatus;

public abstract class DiaryException extends RuntimeException {

    public DiaryException(String message) {super(message);}
    public DiaryException(String message, Throwable cause) {super(message, cause);}

    public abstract HttpStatus getStatusCode();
}
