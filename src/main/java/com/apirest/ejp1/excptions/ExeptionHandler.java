package com.apirest.ejp1.excptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

public class ExeptionHandler extends ResponseEntityExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler(Exception.class)
    public final ResponseEntity<ExceptionResponse> hadledAllException(Exception e){
        ExceptionResponse exceptionResponse= new ExceptionResponse(e.getMessage());
        return new ResponseEntity<>(exceptionResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @org.springframework.web.bind.annotation.ExceptionHandler(ProcessException.class)
    public final ResponseEntity<ExceptionResponse> hadledAllException(ProcessException e){
        ExceptionResponse exceptionResponse;
        if (e.getErros() != null && e.getErros().size() > 0){
            exceptionResponse= new ExceptionResponse(e.getMessage(), e.getErros());
        }else{
            exceptionResponse= new ExceptionResponse(e.getMessage(), e.getErros());
        }
        return new ResponseEntity<>(exceptionResponse, HttpStatus.CONFLICT);
    }
}
