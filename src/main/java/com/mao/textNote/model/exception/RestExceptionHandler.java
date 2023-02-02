package com.mao.textNote.model.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<Object> handleNotFoundExc(NotFoundException exception) {
        return new ResponseEntity(exception.message, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
