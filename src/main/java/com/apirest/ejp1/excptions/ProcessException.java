package com.apirest.ejp1.excptions;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ProcessException extends RuntimeException{
    private List<String> erros;
    public ProcessException(String message) {
        super(message);
    }
    public ProcessException(String message,List<String> erros) {
        super(message);
        this.erros= erros;
    }
}
