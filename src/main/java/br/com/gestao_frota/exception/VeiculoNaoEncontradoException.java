package br.com.gestao_frota.exception;

public class VeiculoNaoEncontradoException extends RuntimeException{
    public VeiculoNaoEncontradoException(String mensagem){
        super(mensagem);
    }
    
}
