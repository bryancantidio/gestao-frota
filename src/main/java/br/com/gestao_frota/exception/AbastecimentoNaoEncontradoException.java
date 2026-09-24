package br.com.gestao_frota.exception;

public class AbastecimentoNaoEncontradoException extends RuntimeException {
    
    public AbastecimentoNaoEncontradoException(String mensagem){
        super(mensagem);
    }
    
}
