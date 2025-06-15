package com.spring_security.spring_security.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleAllExceptions(Exception ex) {
        // Always return only the message, not the stack trace or status
        return ResponseEntity.ok("MESSAGE: " + ex.getMessage());
    }
}
