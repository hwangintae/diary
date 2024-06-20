package com.khpl.uzikdiary.exception;

import org.springframework.http.HttpStatus;

public class NotFoundException extends DiaryException {
    private static final String MESSAGE = "요청한 정보를 찾을 수 없습니다.";

    public NotFoundException() {
        super(MESSAGE);
    }

    @Override
    public HttpStatus getStatusCode() {
        return HttpStatus.BAD_REQUEST;
    }
}
