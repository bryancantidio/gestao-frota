package br.com.gestao_frota.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice 
public class VeiculoExceptionHandler {

    @ExceptionHandler(VeiculoNaoEncontradoException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String tratarVeiculoNaoEncontrado(VeiculoNaoEncontradoException e){
        return e.getMessage();
    } 
    
}
