package com.gadde.helloworld.web.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

import javax.validation.ConstraintViolationException;
import java.util.ArrayList;
import java.util.List;

@ControllerAdvice
public class ExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<List> validateConstraintViolation(ConstraintViolationException exception){
        List<String> errors = new ArrayList(exception.getConstraintViolations().size());

        exception.getConstraintViolations().forEach(constraintViolation -> {
            errors.add(constraintViolation.getPropertyPath()+"   "+constraintViolation.getMessage());
        });

        return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
    }
}
