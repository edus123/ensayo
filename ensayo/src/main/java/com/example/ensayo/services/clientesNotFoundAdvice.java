package com.example.ensayo.services;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
class clientesNotFoundAdvice {

  @ResponseBody
  @ExceptionHandler(clientesNotFoundException.class)
  @ResponseStatus(HttpStatus.NOT_FOUND)
  String employeeNotFoundHandler(clientesNotFoundException ex) {
    return ex.getMessage();
  }
}